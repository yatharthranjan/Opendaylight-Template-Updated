package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.Collections;
import java.util.Map;
import java.math.BigDecimal;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput
 *
 */
public class NegotiationOutputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput> {

    private java.lang.Integer _appId;
    private BigDecimal _diffBandwidth;
    private BigDecimal _diffJitter;
    private BigDecimal _diffPacketDelay;
    private BigDecimal _diffPacketLoss;
    private NegotiationOutcome _response;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>> augmentation = Collections.emptyMap();

    public NegotiationOutputBuilder() {
    }

    public NegotiationOutputBuilder(NegotiationOutput base) {
        this._appId = base.getAppId();
        this._diffBandwidth = base.getDiffBandwidth();
        this._diffJitter = base.getDiffJitter();
        this._diffPacketDelay = base.getDiffPacketDelay();
        this._diffPacketLoss = base.getDiffPacketLoss();
        this._response = base.getResponse();
        if (base instanceof NegotiationOutputImpl) {
            NegotiationOutputImpl impl = (NegotiationOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Integer getAppId() {
        return _appId;
    }
    
    public BigDecimal getDiffBandwidth() {
        return _diffBandwidth;
    }
    
    public BigDecimal getDiffJitter() {
        return _diffJitter;
    }
    
    public BigDecimal getDiffPacketDelay() {
        return _diffPacketDelay;
    }
    
    public BigDecimal getDiffPacketLoss() {
        return _diffPacketLoss;
    }
    
    public NegotiationOutcome getResponse() {
        return _response;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public NegotiationOutputBuilder setAppId(final java.lang.Integer value) {
        this._appId = value;
        return this;
    }
    
     
    public NegotiationOutputBuilder setDiffBandwidth(final BigDecimal value) {
        this._diffBandwidth = value;
        return this;
    }
    
     
    public NegotiationOutputBuilder setDiffJitter(final BigDecimal value) {
        this._diffJitter = value;
        return this;
    }
    
     
    public NegotiationOutputBuilder setDiffPacketDelay(final BigDecimal value) {
        this._diffPacketDelay = value;
        return this;
    }
    
     
    public NegotiationOutputBuilder setDiffPacketLoss(final BigDecimal value) {
        this._diffPacketLoss = value;
        return this;
    }
    
     
    public NegotiationOutputBuilder setResponse(final NegotiationOutcome value) {
        this._response = value;
        return this;
    }
    
    public NegotiationOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public NegotiationOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public NegotiationOutput build() {
        return new NegotiationOutputImpl(this);
    }

    private static final class NegotiationOutputImpl implements NegotiationOutput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput.class;
        }

        private final java.lang.Integer _appId;
        private final BigDecimal _diffBandwidth;
        private final BigDecimal _diffJitter;
        private final BigDecimal _diffPacketDelay;
        private final BigDecimal _diffPacketLoss;
        private final NegotiationOutcome _response;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>> augmentation = Collections.emptyMap();

        private NegotiationOutputImpl(NegotiationOutputBuilder base) {
            this._appId = base.getAppId();
            this._diffBandwidth = base.getDiffBandwidth();
            this._diffJitter = base.getDiffJitter();
            this._diffPacketDelay = base.getDiffPacketDelay();
            this._diffPacketLoss = base.getDiffPacketLoss();
            this._response = base.getResponse();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public java.lang.Integer getAppId() {
            return _appId;
        }
        
        @Override
        public BigDecimal getDiffBandwidth() {
            return _diffBandwidth;
        }
        
        @Override
        public BigDecimal getDiffJitter() {
            return _diffJitter;
        }
        
        @Override
        public BigDecimal getDiffPacketDelay() {
            return _diffPacketDelay;
        }
        
        @Override
        public BigDecimal getDiffPacketLoss() {
            return _diffPacketLoss;
        }
        
        @Override
        public NegotiationOutcome getResponse() {
            return _response;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            if (augmentationType == null) {
                throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
            }
            return (E) augmentation.get(augmentationType);
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_appId);
            result = prime * result + Objects.hashCode(_diffBandwidth);
            result = prime * result + Objects.hashCode(_diffJitter);
            result = prime * result + Objects.hashCode(_diffPacketDelay);
            result = prime * result + Objects.hashCode(_diffPacketLoss);
            result = prime * result + Objects.hashCode(_response);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput other = (org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput)obj;
            if (!Objects.equals(_appId, other.getAppId())) {
                return false;
            }
            if (!Objects.equals(_diffBandwidth, other.getDiffBandwidth())) {
                return false;
            }
            if (!Objects.equals(_diffJitter, other.getDiffJitter())) {
                return false;
            }
            if (!Objects.equals(_diffPacketDelay, other.getDiffPacketDelay())) {
                return false;
            }
            if (!Objects.equals(_diffPacketLoss, other.getDiffPacketLoss())) {
                return false;
            }
            if (!Objects.equals(_response, other.getResponse())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                NegotiationOutputImpl otherImpl = (NegotiationOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722.NegotiationOutput>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("NegotiationOutput [");
            boolean first = true;
        
            if (_appId != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_appId=");
                builder.append(_appId);
             }
            if (_diffBandwidth != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_diffBandwidth=");
                builder.append(_diffBandwidth);
             }
            if (_diffJitter != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_diffJitter=");
                builder.append(_diffJitter);
             }
            if (_diffPacketDelay != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_diffPacketDelay=");
                builder.append(_diffPacketDelay);
             }
            if (_diffPacketLoss != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_diffPacketLoss=");
                builder.append(_diffPacketLoss);
             }
            if (_response != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_response=");
                builder.append(_response);
             }
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("augmentation=");
            builder.append(augmentation.values());
            return builder.append(']').toString();
        }
    }

}
