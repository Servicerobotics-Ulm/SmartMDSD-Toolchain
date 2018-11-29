//--------------------------------------------------------------------------
//
//  Copyright (C) 2016 Alex Lotz
//
//        lotz@hs-ulm.de
//
//        Servicerobotik Ulm
//        Christian Schlegel
//        University of Applied Sciences
//        Prittwitzstr. 10
//        89075 Ulm
//        Germany
//
//  This file is part of the SmartSoft MDSD Toolchain. 
//
//  This library is free software; you can redistribute it and/or
//  modify it under the terms of the GNU Lesser General Public
//  License as published by the Free Software Foundation; either
//  version 2.1 of the License, or (at your option) any later version.
//
//  This library is distributed in the hope that it will be useful,
//  but WITHOUT ANY WARRANTY; without even the implied warranty of
//  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
//  Lesser General Public License for more details.
//
//  You should have received a copy of the GNU Lesser General Public
//  License along with this library; if not, write to the Free Software
//  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
//
//--------------------------------------------------------------------------

package org.sirius.tools;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.DragTracker;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sirius.diagram.CustomStyle;
import org.eclipse.sirius.diagram.DiagramFactory;
import org.eclipse.sirius.diagram.WorkspaceImage;
import org.eclipse.sirius.diagram.ui.edit.api.part.AbstractNotSelectableShapeNodeEditPart;
import org.eclipse.sirius.diagram.ui.edit.api.part.IStyleEditPart;
import org.eclipse.sirius.diagram.ui.tools.api.figure.AirStyleDefaultSizeNodeFigure;
import org.eclipse.sirius.diagram.ui.tools.api.figure.IWorkspaceImageFigure;
import org.eclipse.sirius.diagram.ui.tools.api.figure.WorkspaceImageFigure;

public class CommPortEditPart extends AbstractNotSelectableShapeNodeEditPart implements IStyleEditPart {
    public DragTracker getDragTracker(Request request) {
//    	System.out.println("getDragTracker()");
        return getParent().getDragTracker(request);
    }

	
    /**
     * the content pane.
     */
    protected IFigure contentPane;
    

    /**
     * the primary shape.
     */
    protected WorkspaceImage leftImage;
    protected WorkspaceImage rightImage;
    protected WorkspaceImage topImage;
    protected WorkspaceImage bottomImage;
    protected IWorkspaceImageFigure primaryShape;
    //protected ImageFigure primaryShape;
    
    public CommPortEditPart(View view) {
    	super(view);
    }
    
    protected void createDefaultEditPolicies() {
        // Do nothing.
    }
	
	
	@Override
    protected NodeFigure createNodeFigure() {
        NodeFigure figure = createNodePlate();
        figure.setLayoutManager(new StackLayout());
        IFigure shape = createNodeShape();
        figure.add(shape);
        contentPane = setupContentPane(shape);
        return figure;
    }

    private NodeFigure createNodePlate() {
        DefaultSizeNodeFigure result = new AirStyleDefaultSizeNodeFigure(getMapMode().DPtoLP(40), getMapMode().DPtoLP(40));
        return result;
    }
    
    
    protected IFigure createNodeShape() {
    	EObject element = resolveSemanticElement();
        IWorkspaceImageFigure wif = null;
        if (element instanceof CustomStyle) {
        	CustomStyle customStyle = (CustomStyle)element;
            String baseImagePath = Activator.PLUGIN_ID + "/icons/" + customStyle.getId();
            
            leftImage = DiagramFactory.eINSTANCE.createWorkspaceImage();
            rightImage = DiagramFactory.eINSTANCE.createWorkspaceImage();
            topImage = DiagramFactory.eINSTANCE.createWorkspaceImage();
            bottomImage = DiagramFactory.eINSTANCE.createWorkspaceImage();
            
            leftImage.setWorkspacePath(baseImagePath+"/left.png");
            rightImage.setWorkspacePath(baseImagePath+"/right.png");
            topImage.setWorkspacePath(baseImagePath+"/up.png");
            bottomImage.setWorkspacePath(baseImagePath+"/down.png");
            
            wif = WorkspaceImageFigure.createImageFigure(leftImage);
            
            // not sure if the following (commented) part might be needed (or not)
//            EditPart parent = this.getParent();
//            if (parent instanceof IDiagramBorderNodeEditPart && wif instanceof ITransparentFigure) {
//                DiagramBorderNodeEditPartOperation.updateTransparencyMode((IDiagramBorderNodeEditPart) parent, (ITransparentFigure) wif);
//            }
        }
        return primaryShape = wif;
    }

    public EditPolicy getPrimaryDragEditPolicy() {
    	//System.out.println("getPrimaryDragEditPolicy()");
        EditPolicy result = super.getPrimaryDragEditPolicy();
        if (result instanceof ResizableEditPolicy) {
            ResizableEditPolicy ep = (ResizableEditPolicy) result;
            ep.setResizeDirections(PositionConstants.NONE);
        }
        return result;
    }
//    /**
//     * Create the instance role figure.
//     *
//     * @return the created figure.
//     */
//    protected IFigure createNodeShape() {
//    	if(primaryShape == null) {
//    		primaryShape = WorkspaceImageFigure.createImageFigure(currentImage);
//    	}
//    	return primaryShape;
//    }
 
    public IWorkspaceImageFigure getPrimaryShape() {
        return primaryShape;
    }
   
//    protected ImageFigure createNodeShape() {
//        if (primaryShape == null) {
//            primaryShape = new ImageFigure();
//        }
//        return primaryShape;
//    }
//    public ImageFigure getPrimaryShape() {
//        return primaryShape;
//    }
    
//  protected void updatePrimaryShape(String imagePath) {
//	primaryShape.setImage(WorkspaceImageFigure.getImageInstanceFromPath(imagePath));    	
//}
    
    /**
     * Default implementation treats passed figure as content pane. Respects
     * layout one may have set for generated figure.
     *
     * @param nodeShape
     *            instance of generated figure class
     * @return the figure
     */
    protected IFigure setupContentPane(IFigure nodeShape) {
        return nodeShape; // use nodeShape itself as contentPane
    }
    
    public IFigure getContentPane() {
        if (contentPane != null) {
            return contentPane;
        }
        return super.getContentPane();
    }
    
    
    // this is the original implementation from WorkspaceImageEditPart (not sure if there is something needed):
//    protected void refreshVisuals() {
//        super.refreshVisuals();
//        IWorkspaceImageFigure figure = this.getPrimaryShape();
//        EObject element = this.resolveSemanticElement();
//        if (element instanceof WorkspaceImage && figure != null) {
//            WorkspaceImage bundledImage = (WorkspaceImage) element;
//            figure.refreshFigure(bundledImage);
//            DiagramNodeEditPartOperation.refreshNodeLabelAlignment(figure, bundledImage);
//            ((GraphicalEditPart) this.getParent()).setLayoutConstraint(this, this.getFigure(), new Rectangle(0, 0, figure.getPreferredSize().width, figure.getPreferredSize().height));
//        }
//    }

    protected void refreshVisuals() {
    	super.refreshVisuals();
        if(this.getModel() instanceof Node) {
        	Node model = (Node)this.getModel();
        	Node portNode = (Node)model.eContainer();
        	
        	if(portNode.getLayoutConstraint() instanceof Bounds) {
        		Bounds portBounds = (Bounds)portNode.getLayoutConstraint();
        	
            	Node componentNode = (Node)portNode.eContainer();
            	if(componentNode.getLayoutConstraint() instanceof Bounds) {
            		// check the current position of the boundary node with respect to the parent container boundaries
            		Bounds compBounds = (Bounds)componentNode.getLayoutConstraint();
            		if(portBounds.getX() < 0) {
            			// port on the left
//            			System.out.println("Left");
            			primaryShape.refreshFigure(leftImage);
            		} else if(portBounds.getY() < 0) {
            			// port on top
//            			System.out.println("Top");
            			primaryShape.refreshFigure(topImage);
            		} else if(compBounds.getWidth() < (portBounds.getX()+portBounds.getWidth())) {
            			// port on the right
//            			System.out.println("Right");
            			primaryShape.refreshFigure(rightImage);
            		} else {
            			// port on the bottom
//            			System.out.println("Bottom");
            			primaryShape.refreshFigure(bottomImage);
            		}
            		//primaryShape.repaint();
            	}
        	}
        }
    }
}
