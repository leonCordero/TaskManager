package onea.view;

import com.vaadin.navigator.Navigator;
import com.vaadin.ui.ComponentContainer;
import com.vaadin.ui.CssLayout;
import com.vaadin.ui.HorizontalLayout;

/**
 * Created by leon1a on 20/01/17.
 */
public class MainView extends HorizontalLayout{

    public MainView() {
        setSizeFull();
        addStyleName("mainview");

        addComponent(new SidebarMenu());

        ComponentContainer content = new CssLayout();
        content.addStyleName("view-content");
        content.setSizeFull();
        addComponent(content);
        setExpandRatio(content, 1.0f);


    }

}
