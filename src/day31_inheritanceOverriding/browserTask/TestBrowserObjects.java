package day31_inheritanceOverriding.browserTask;

import day29_inharitance.Phone.Samsung;

// Main class to test the implementation
public class TestBrowserObjects {
    public static void main(String[] args) {

        // Creating instances of each browser subclass
        Chrome chrome = new Chrome();
        FireFox fireFox = new FireFox();
        Opera opera = new Opera();
        Safari safari = new Safari();

        // Testing openBrowser and closeBrowser methods

        chrome.openBrowser();
        chrome.closeBrowser();

        fireFox.openBrowser();
        fireFox.closeBrowser();

        opera.openBrowser();
        opera.closeBrowser();

        safari.openBrowser();
        safari.closeBrowser();
    }
}
