package tr.com.yusufgunduz.jsftest;


import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * Created by Kambaa on 5/5/17.
 */
@Named
@ViewScoped
@Stateless
public class TestEJBBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String test;

    @PostConstruct
    public void init() {
        test = "wasd";
    }

    public String getTest() {
        return test;
    }
}
