package com.jcn.jaxb2.plugin;

import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;
import com.sun.codemodel.JMod;
import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.Plugin;
import com.sun.tools.xjc.outline.ClassOutline;
import com.sun.tools.xjc.outline.Outline;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

import java.util.ArrayList;
import java.util.List;

/**
 * Add-on that works on the generated source code.
 * Search for getters that returns {@link Boolean} that are using
 * is... instead of get... to follow the naming convention
 * for non primitive boolean
 * User: christos-karalis
 * Date: 20/10/2013
 * Time: 11:22
 */
public class GetterBooleanPlugin extends Plugin {
    @Override
    public String getOptionName() {
        return "XBoolean-getter";
    }

    @Override
    public String getUsage() {
        return "XBoolean-getter    : creates getter for Boolean types";
    }

    /**
     * It replaces isXXXX methods with getXXXX for {@link Boolean}
     * @param outline
     * @param options
     * @param errorHandler
     * @return
     * @throws SAXException
     */
    @Override
    public boolean run(Outline outline, Options options, ErrorHandler errorHandler) throws SAXException {
        for (ClassOutline co : outline.getClasses()) {
            JDefinedClass jdc = co.implClass;
            // avoid concurrent modification by copying the fields in a new list
            for (JMethod method : jdc.methods()) {
                if (method.type().name().equals("Boolean")
                        && method.name().startsWith("is")) {
                    String trimmed = method.name().substring(2);
                    method.name("get"+trimmed);
                }
            }
        }
        return true;
    }
}
