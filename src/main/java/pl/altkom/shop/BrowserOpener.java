package pl.altkom.shop;

import java.awt.Desktop;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class BrowserOpener {
	@PostConstruct
	public void open() {
		Desktop.getDesktop();
	}

}
