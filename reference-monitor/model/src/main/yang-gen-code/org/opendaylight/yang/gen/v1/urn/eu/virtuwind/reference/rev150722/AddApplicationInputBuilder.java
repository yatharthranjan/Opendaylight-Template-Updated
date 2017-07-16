package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722;
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
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput
 *
 */
public class AddApplicationInputBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput> {

    private java.lang.Integer _appId;
    private BigDecimal _bandwidth;
    private BigDecimal _jitter;
    private BigDecimal _packetDelay;
    private BigDecimal _packetLoss;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput>> augmentation = Collections.emptyMap();

    public AddApplicationInputBuilder() {
    }

    public AddApplicationInputBuilder(AddApplicationInput base) {
        this._appId = base.getAppId();
        this._bandwidth = base.getBandwidth();
        this._jitter = base.getJitter();
        this._packetDelay = base.getPacketDelay();
        this._packetLoss = base.getPacketLoss();
        if (base instanceof AddApplicationInputImpl) {
            AddApplicationInputImpl impl = (AddApplicationInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Integer getAppId() {
        return _appId;
    }
    
    public BigDecimal getBandwidth() {
        return _bandwidth;
    }
    
    public BigDecimal getJitter() {
        return _jitter;
    }
    
    public BigDecimal getPacketDelay() {
        return _packetDelay;
    }
    
    public BigDecimal getPacketLoss() {
        return _packetLoss;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public AddApplicationInputBuilder setAppId(final java.lang.Integer value) {
        this._appId = value;
        return this;
    }
    
     
    public AddApplicationInputBuilder setBandwidth(final BigDecimal value) {
        this._bandwidth = value;
        return this;
    }
    
     
    public AddApplicationInputBuilder setJitter(final BigDecimal value) {
        this._jitter = value;
        return this;
    }
    
     
    public AddApplicationInputBuilder setPacketDelay(final BigDecimal value) {
        this._packetDelay = value;
        return this;
    }
    
     
    public AddApplicationInputBuilder setPacketLoss(final BigDecimal value) {
        this._packetLoss = value;
        return this;
    }
    
    public AddApplicationInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public AddApplicationInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public AddApplicationInput build() {
        return new AddApplicationInputImpl(this);
    }

    private static final class AddApplicationInputImpl implements AddApplicationInput {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput.class;
        }

        private final java.lang.Integer _appId;
        private final BigDecimal _bandwidth;
        private final BigDecimal _jitter;
        private final BigDecimal _packetDelay;
        private final BigDecimal _packetLoss;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput>> augmentation = Collections.emptyMap();

        private AddApplicationInputImpl(AddApplicationInputBuilder base) {
            this._appId = base.getAppId();
            this._bandwidth = base.getBandwidth();
            this._jitter = base.getJitter();
            this._packetDelay = base.getPacketDelay();
            this._packetLoss = base.getPacketLoss();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput>>singletonMap(e.getKey(), e.getValue());
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
        public BigDecimal getBandwidth() {
            return _bandwidth;
        }
        
        @Override
        public BigDecimal getJitter() {
            return _jitter;
        }
        
        @Override
        public BigDecimal getPacketDelay() {
            return _packetDelay;
        }
        
        @Override
        public BigDecimal getPacketLoss() {
            return _packetLoss;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_bandwidth);
            result = prime * result + Objects.hashCode(_jitter);
            result = prime * result + Objects.hashCode(_packetDelay);
            result = prime * result + Objects.hashCode(_packetLoss);
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
            if (!org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput other = (org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput)obj;
            if (!Objects.equals(_appId, other.getAppId())) {
                return false;
            }
            if (!Objects.equals(_bandwidth, other.getBandwidth())) {
                return false;
            }
            if (!Objects.equals(_jitter, other.getJitter())) {
                return false;
            }
            if (!Objects.equals(_packetDelay, other.getPacketDelay())) {
                return false;
            }
            if (!Objects.equals(_packetLoss, other.getPacketLoss())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AddApplicationInputImpl otherImpl = (AddApplicationInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput>>, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.AddApplicationInput>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("AddApplicationInput [");
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
            if (_bandwidth != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_bandwidth=");
                builder.append(_bandwidth);
             }
            if (_jitter != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_jitter=");
                builder.append(_jitter);
             }
            if (_packetDelay != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetDelay=");
                builder.append(_packetDelay);
             }
            if (_packetLoss != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_packetLoss=");
                builder.append(_packetLoss);
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
