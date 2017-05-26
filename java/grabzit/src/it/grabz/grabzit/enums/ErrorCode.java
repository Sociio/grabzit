/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package it.grabz.grabzit.enums;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author GrabzIt
 */
public enum ErrorCode {
    SUCCESS(0),
    PARAMETERNOURL(100),
    PARAMETERINVALIDURL(101),
    PARAMETERNONEXISTANTURL(102),
    PARAMETERMISSINGAPPLICATIONKEY(103),
    PARAMETERUNRECOGNISEDAPPLICATIONKEY(104),
    PARAMETERMISSINGSIGNATURE(105),
    PARAMETERINVALIDSIGNATURE(106),
    PARAMETERINVALIDFORMAT(107),
    PARAMETERINVALIDCOUNTRYCODE(108),
    PARAMETERDUPLICATEIDENTIFIER(109),
    PARAMETERMATCHINGRECORDNOTFOUND(110),
    PARAMETERINVALIDCALLBACKURL(111),
    PARAMETERNONEXISTANTCALLBACKURL(112),
    PARAMETERIMAGEWIDTHTOOLARGE(113),
    PARAMETERIMAGEHEIGHTTOOLARGE(114),
    PARAMETERBROWSERWIDTHTOOLARGE(115),
    PARAMETERBROWSERHEIGHTTOOLARGE(116),
    PARAMETERDELAYTOOLARGE(117),
    PARAMETERINVALIDBACKGROUND(118),
    PARAMETERINVALIDINCLUDELINKS(119),
    PARAMETERINVALIDINCLUDEOUTLINE(120),
    PARAMETERINVALIDPAGESIZE(121),
    PARAMETERINVALIDPAGEORIENTATION(122),
    PARAMETERVERTICALMARGINTOOLARGE(123),
    PARAMETERHORIZONTALMARGINTOOLARGE(124),
    PARAMETERINVALIDCOVERURL(125),
    PARAMETERNONEXISTANTCOVERURL(126),
    PARAMETERMISSINGCOOKIENAME(127),
    PARAMETERMISSINGCOOKIEDOMAIN(128),
    PARAMETERINVALIDCOOKIENAME(129),
    PARAMETERINVALIDCOOKIEDOMAIN(130),
    PARAMETERINVALIDCOOKIEDELETE(131),
    PARAMETERINVALIDCOOKIEHTTP(132),
    PARAMETERINVALIDCOOKIEEXPIRY(133),
    PARAMETERINVALIDCACHEVALUE(134),
    PARAMETERINVALIDDOWNLOADVALUE(135),
    PARAMETERINVALIDSUPRESSVALUE(136),
    PARAMETERMISSINGWATERMARKIDENTIFIER(137),
    PARAMETERINVALIDWATERMARKIDENTIFIER(138),
    PARAMETERINVALIDWATERMARKXPOS(139),
    PARAMETERINVALIDWATERMARKYPOS(140),
    PARAMETERMISSINGWATERMARKFORMAT(141),
    PARAMETERWATERMARKTOOLARGE(142),
    PARAMETERMISSINGPARAMETERS(143),
    PARAMETERQUALITYTOOLARGE(144),
    PARAMETERQUALITYTOOSMALL(145),    
    PARAMETERREPEATTOOSMALL(149),
    PARAMETERINVALIDREVERSE(150),
    PARAMETERFPSTOOLARGE(151),
    PARAMETERFPSTOOSMALL(152),
    PARAMETERSPEEDTOOFAST(153),
    PARAMETERSPEEDTOOSLOW(154),
    PARAMETERINVALIDANIMATIONCOMBINATION(155),
    PARAMETERSTARTTOOSMALL(156),
    PARAMETERDURATIONTOOLARGE(157),  
    PARAMETERNOHTML(163),
    PARAMETERINVALIDTARGETVALUE(165),
    PARAMETERINVALIDHIDEVALUE(166),
    PARAMETERINVALIDINCLUDEIMAGES(167),
    NETWORKSERVEROFFLINE(200),
    NETWORKGENERALERROR(201),
    NETWORKDDOSATTACK(202),
    RENDERINGERROR(300),
    RENDERINGMISSINGSCREENSHOT(301),
    GENERICERROR(400),
    UPGRADEREQUIRED(500),
    FILESAVEERROR(600),
    FILENONEXISTANTPATH(601);
    
    private int value;
    
    private static Map<Integer, ErrorCode> map = new HashMap<Integer, ErrorCode>();

    ErrorCode(int value)
    {
        this.value = value;
    }
    
    static {
        for (ErrorCode errorCode : ErrorCode.values()) {
            map.put(errorCode.getValue(), errorCode);
        }
    }

    public static ErrorCode valueOf(int value) {
        return map.get(value);
    }    
    
    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }
}
