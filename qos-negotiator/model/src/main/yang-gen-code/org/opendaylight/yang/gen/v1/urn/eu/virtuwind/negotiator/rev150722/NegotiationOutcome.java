package org.opendaylight.yang.gen.v1.urn.eu.virtuwind.negotiator.rev150722;


public enum NegotiationOutcome {
    ACCEPT(0),
    
    REJECT(1),
    
    NEGOTIATE(2)
    ;


    int value;
    private static final java.util.Map<java.lang.Integer, NegotiationOutcome> VALUE_MAP;

    static {
        final com.google.common.collect.ImmutableMap.Builder<java.lang.Integer, NegotiationOutcome> b = com.google.common.collect.ImmutableMap.builder();
        for (NegotiationOutcome enumItem : NegotiationOutcome.values())
        {
            b.put(enumItem.value, enumItem);
        }

        VALUE_MAP = b.build();
    }

    private NegotiationOutcome(int value) {
        this.value = value;
    }

    /**
     * @return integer value
     */
    public int getIntValue() {
        return value;
    }

    /**
     * @param valueArg
     * @return corresponding NegotiationOutcome item
     */
    public static NegotiationOutcome forValue(int valueArg) {
        return VALUE_MAP.get(valueArg);
    }
}
