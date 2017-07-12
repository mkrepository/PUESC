
package pl.gov.mf.schematy.sisc.wschannel._2014._01_v2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for systemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="systemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SZPROT"/>
 *     &lt;enumeration value="AIS"/>
 *     &lt;enumeration value="OSOZ2"/>
 *     &lt;enumeration value="NCTS2"/>
 *     &lt;enumeration value="ZEFIR2"/>
 *     &lt;enumeration value="ISZTAR4"/>
 *     &lt;enumeration value="HERMES2"/>
 *     &lt;enumeration value="AES"/>
 *     &lt;enumeration value="EMCSPL2"/>
 *     &lt;enumeration value="INTRASTAT"/>
 *     &lt;enumeration value="EBT"/>
 *     &lt;enumeration value="PODMIOT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "systemType")
@XmlEnum
public enum SystemType {

    SZPROT("SZPROT"),
    AIS("AIS"),
    @XmlEnumValue("OSOZ2")
    OSOZ_2("OSOZ2"),
    @XmlEnumValue("NCTS2")
    NCTS_2("NCTS2"),
    @XmlEnumValue("ZEFIR2")
    ZEFIR_2("ZEFIR2"),
    @XmlEnumValue("ISZTAR4")
    ISZTAR_4("ISZTAR4"),
    @XmlEnumValue("HERMES2")
    HERMES_2("HERMES2"),
    AES("AES"),
    @XmlEnumValue("EMCSPL2")
    EMCSPL_2("EMCSPL2"),
    INTRASTAT("INTRASTAT"),
    EBT("EBT"),

    /**
     * 
     *                         The "PODMIOT" const. value used in communication from SEAP to External System.      
     *                     
     * 
     */
    PODMIOT("PODMIOT");
    private final String value;

    SystemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SystemType fromValue(String v) {
        for (SystemType c: SystemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
