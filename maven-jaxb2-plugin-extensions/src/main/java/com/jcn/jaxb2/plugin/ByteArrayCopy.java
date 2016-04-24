package com.jcn.jaxb2.plugin;

import com.sun.tools.xjc.Options;
import com.sun.tools.xjc.outline.Outline;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;

/**
 * Created with IntelliJ IDEA.
 * User: Χρήστος
 * Date: 28/1/2014
 * Time: 1:21 πμ
 * To change this template use File | Settings | File Templates.
 */
public class ByteArrayCopy extends AbstractFieldClone {

    @Override
    public String getOptionName() {
        return "Xbyte-array-copy";
    }

    @Override
    public String getUsage() {
        return "Xbyte-array-copy    : copies the arrays ";
    }

    @Override
    public boolean run(Outline outline, Options options, ErrorHandler errorHandler) throws SAXException {
        return run(outline, options, errorHandler, "byte[]");
    }
}