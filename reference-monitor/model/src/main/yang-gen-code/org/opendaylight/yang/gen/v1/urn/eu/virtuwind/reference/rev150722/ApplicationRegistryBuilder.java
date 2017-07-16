package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.application.registry.ApplicationRegistryEntry;
import java.util.HashMap;
import org.opendaylight.yangtools.concepts.Builder;
import java.util.Objects;
import java.util.List;
import java.util.Collections;
import java.util.Map;


/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry} instances.
 *
 * @see org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry
 *
 */
public class ApplicationRegistryBuilder implements Builder <org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry> {

    private List<ApplicationRegistryEntry> _applicationRegistryEntry;

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>>, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>> augmentation = Collections.emptyMap();

    public ApplicationRegistryBuilder() {
    }

    public ApplicationRegistryBuilder(ApplicationRegistry base) {
        this._applicationRegistryEntry = base.getApplicationRegistryEntry();
        if (base instanceof ApplicationRegistryImpl) {
            ApplicationRegistryImpl impl = (ApplicationRegistryImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public List<ApplicationRegistryEntry> getApplicationRegistryEntry() {
        return _applicationRegistryEntry;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>> E getAugmentation(java.lang.Class<E> augmentationType) {
        if (augmentationType == null) {
            throw new IllegalArgumentException("Augmentation Type reference cannot be NULL!");
        }
        return (E) augmentation.get(augmentationType);
    }

     
    public ApplicationRegistryBuilder setApplicationRegistryEntry(final List<ApplicationRegistryEntry> value) {
        this._applicationRegistryEntry = value;
        return this;
    }
    
    public ApplicationRegistryBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry> augmentation) {
        if (augmentation == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentation);
        return this;
    }
    
    public ApplicationRegistryBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    public ApplicationRegistry build() {
        return new ApplicationRegistryImpl(this);
    }

    private static final class ApplicationRegistryImpl implements ApplicationRegistry {

        public java.lang.Class<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry.class;
        }

        private final List<ApplicationRegistryEntry> _applicationRegistryEntry;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>>, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>> augmentation = Collections.emptyMap();

        private ApplicationRegistryImpl(ApplicationRegistryBuilder base) {
            this._applicationRegistryEntry = base.getApplicationRegistryEntry();
            switch (base.augmentation.size()) {
            case 0:
                this.augmentation = Collections.emptyMap();
                break;
            case 1:
                final Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>>, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>> e = base.augmentation.entrySet().iterator().next();
                this.augmentation = Collections.<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>>, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>>singletonMap(e.getKey(), e.getValue());
                break;
            default :
                this.augmentation = new HashMap<>(base.augmentation);
            }
        }

        @Override
        public List<ApplicationRegistryEntry> getApplicationRegistryEntry() {
            return _applicationRegistryEntry;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_applicationRegistryEntry);
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
            if (!org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry other = (org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry)obj;
            if (!Objects.equals(_applicationRegistryEntry, other.getApplicationRegistryEntry())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ApplicationRegistryImpl otherImpl = (ApplicationRegistryImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>>, Augmentation<org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.ApplicationRegistry>> e : augmentation.entrySet()) {
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
            java.lang.StringBuilder builder = new java.lang.StringBuilder ("ApplicationRegistry [");
            boolean first = true;
        
            if (_applicationRegistryEntry != null) {
                if (first) {
                    first = false;
                } else {
                    builder.append(", ");
                }
                builder.append("_applicationRegistryEntry=");
                builder.append(_applicationRegistryEntry);
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
