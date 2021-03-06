package com.jcn.jaxb2.plugin;

import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

/**
 * Add-on that works on the generated source code.
 * It creates a clone for the returned value provided from
 * getter fields for (@link Date} fields. The reverse
 * applies for setters too
 * User: christos-karalis
 * Date: 28/1/2014
 * Time: 1:21 am
 */
public class DateClone extends AbstractFieldClone {

    @Override
    public String getOptionName() {
        return "Xdate-clone";
    }

    @Override
    public String getUsage() {
        return "Xdate-clone    : replace setters/getters by using clone ";
    }

    @Override
    public boolean run(Outline outline, Options options, ErrorHandler errorHandler) throws SAXException {
        return run(outline, options, errorHandler, "Date");
    }

}