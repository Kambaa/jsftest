package tr.com.yusufgunduz.jsftest;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.io.Serializable;

/**
 * Created by Kambaa on 5/5/17.
 */
@ManagedBean
@ViewScoped
public class TestBean implements Serializable {


    private String name;
    private Integer age;

    @Inject
    private TestEJBBean testEJBBean;

    private Boolean formEditEnabled;

    @PostConstruct
    public void init() {
        name = "Yusuf Gündüz";
        age = 31;
        formEditEnabled = Boolean.FALSE;
    }

    public void enableFormEditing() {
        formEditEnabled = Boolean.TRUE;
    }

    public void saveData() {
        formEditEnabled = Boolean.FALSE;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getFormEditEnabled() {
        return formEditEnabled;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public TestEJBBean getTestEJBBean() {
        return testEJBBean;
    }
}
