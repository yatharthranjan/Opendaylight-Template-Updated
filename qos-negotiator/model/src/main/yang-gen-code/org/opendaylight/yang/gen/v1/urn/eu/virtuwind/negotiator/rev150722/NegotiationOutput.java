package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import java.math.BigDecimal;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>negotiator</b>
 * <br>(Source path: <i>META-INF/yang/negotiator.yang</i>):
 * <pre>
 * container output {
 *     leaf appId {
 *         type int32;
 *     }
 *     leaf response {
 *         type NegotiationOutcome;
 *     }
 *     leaf diffBandwidth {
 *         type decimal64;
 *     }
 *     leaf diffPacketLoss {
 *         type decimal64;
 *     }
 *     leaf diffPacketDelay {
 *         type decimal64;
 *     }
 *     leaf diffJitter {
 *         type decimal64;
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>negotiator/negotiation/output</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutputBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutputBuilder
 *
 */
public interface NegotiationOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:eu:virtuwind:negotiator",
        "2015-07-22", "output").intern();

    java.lang.Integer getAppId();
    
    NegotiationOutcome getResponse();
    
    BigDecimal getDiffBandwidth();
    
    BigDecimal getDiffPacketLoss();
    
    BigDecimal getDiffPacketDelay();
    
    BigDecimal getDiffJitter();

}

