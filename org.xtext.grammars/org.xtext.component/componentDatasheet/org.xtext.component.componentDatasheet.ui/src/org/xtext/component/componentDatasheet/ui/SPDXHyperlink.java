package org.xtext.component.componentDatasheet.ui;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;

public class SPDXHyperlink implements IHyperlink {
	private final IRegion _spdxRegion;
	private final String _spdxId;
	
	public SPDXHyperlink(IRegion urlRegion, String spdxId) {
		_spdxRegion = urlRegion;
		_spdxId = spdxId;
    }
	
	@Override
	public IRegion getHyperlinkRegion() {
		return _spdxRegion;
	}

	@Override
	public String getTypeLabel() {
		return _spdxId;
	}

	@Override
	public String getHyperlinkText() {
		String urlString = "https://spdx.org/licenses/" + _spdxId + ".html";
		return urlString;
	}

	@Override
	public void open() {
		String urlString = "https://spdx.org/licenses/" + _spdxId + ".html";
		try {
			URL url = new URL(urlString);
			IWebBrowser externalBrowser = PlatformUI.getWorkbench().getBrowserSupport().getExternalBrowser();
			externalBrowser.openURL(url);
			// alternatively we can also use a builtin Eclipse browser 
//			IWebBrowser newBrowser = PlatformUI.getWorkbench().getBrowserSupport().createBrowser(null);
//			newBrowser.openURL(url);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}

}
