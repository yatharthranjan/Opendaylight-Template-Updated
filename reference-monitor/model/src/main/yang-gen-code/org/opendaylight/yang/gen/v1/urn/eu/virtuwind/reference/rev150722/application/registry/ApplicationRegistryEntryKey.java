package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.application.registry;
import org.opendaylight.yangtools.yang.binding.Identifier;
import java.util.Objects;


public class ApplicationRegistryEntryKey
 implements Identifier<ApplicationRegistryEntry> {
    private static final long serialVersionUID = -1759834142826668237L;
    private final java.lang.Integer _appId;


    public ApplicationRegistryEntryKey(java.lang.Integer _appId) {
    
    
        this._appId = _appId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ApplicationRegistryEntryKey(ApplicationRegistryEntryKey source) {
        this._appId = source._appId;
    }


    public java.lang.Integer getAppId() {
        return _appId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_appId);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        ApplicationRegistryEntryKey other = (ApplicationRegistryEntryKey) obj;
        if (!Objects.equals(_appId, other._appId)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.urn.eu.virtuwind.reference.rev150722.application.registry.ApplicationRegistryEntryKey.class.getSimpleName()).append(" [");
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
        return builder.append(']').toString();
    }
}

