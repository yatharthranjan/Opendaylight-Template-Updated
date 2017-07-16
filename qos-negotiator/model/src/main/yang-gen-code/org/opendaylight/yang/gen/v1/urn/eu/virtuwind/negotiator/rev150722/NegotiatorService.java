package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>negotiator</b>
 * <br>(Source path: <i>META-INF/yang/negotiator.yang</i>):
 * <pre>
 * rpc negotiation {
 *     input {
 *         leaf appId {
 *             type int32;
 *         }
 *         leaf bandwidth {
 *             type decimal64;
 *         }
 *         leaf packetLoss {
 *             type decimal64;
 *         }
 *         leaf packetDelay {
 *             type decimal64;
 *         }
 *         leaf jitter {
 *             type decimal64;
 *         }
 *     }
 *     
 *     output {
 *         leaf appId {
 *             type int32;
 *         }
 *         leaf response {
 *             type NegotiationOutcome;
 *         }
 *         leaf diffBandwidth {
 *             type decimal64;
 *         }
 *         leaf diffPacketLoss {
 *             type decimal64;
 *         }
 *         leaf diffPacketDelay {
 *             type decimal64;
 *         }
 *         leaf diffJitter {
 *             type decimal64;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface NegotiatorService
    extends
    RpcService
{




    Future<RpcResult<NegotiationOutput>> negotiation(NegotiationInput input);

}

