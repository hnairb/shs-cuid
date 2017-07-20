
package com.searshc.hs.sywr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PHONE"/&gt;
 *     &lt;enumeration value="MEMBER_NO"/&gt;
 *     &lt;enumeration value="EMAIL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "type", namespace = "http://com.searshc.hs.sywr/request")
@XmlEnum
public enum Type {

    PHONE,
    MEMBER_NO,
    EMAIL;

    public String value() {
        return name();
    }

    public static Type fromValue(String v) {
        return valueOf(v);
    }

}
