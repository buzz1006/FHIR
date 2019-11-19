/*
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.fhir.model.type.code;

import com.ibm.fhir.model.type.Code;
import com.ibm.fhir.model.type.Extension;
import com.ibm.fhir.model.type.String;

import java.util.Collection;
import java.util.Objects;

import javax.annotation.Generated;

@Generated("com.ibm.fhir.tools.CodeGenerator")
public class CareTeamStatus extends Code {
    /**
     * Proposed
     */
    public static final CareTeamStatus PROPOSED = CareTeamStatus.builder().value(ValueSet.PROPOSED).build();

    /**
     * Active
     */
    public static final CareTeamStatus ACTIVE = CareTeamStatus.builder().value(ValueSet.ACTIVE).build();

    /**
     * Suspended
     */
    public static final CareTeamStatus SUSPENDED = CareTeamStatus.builder().value(ValueSet.SUSPENDED).build();

    /**
     * Inactive
     */
    public static final CareTeamStatus INACTIVE = CareTeamStatus.builder().value(ValueSet.INACTIVE).build();

    /**
     * Entered in Error
     */
    public static final CareTeamStatus ENTERED_IN_ERROR = CareTeamStatus.builder().value(ValueSet.ENTERED_IN_ERROR).build();

    private volatile int hashCode;

    private CareTeamStatus(Builder builder) {
        super(builder);
    }

    public static CareTeamStatus of(ValueSet value) {
        switch (value) {
        case PROPOSED:
            return PROPOSED;
        case ACTIVE:
            return ACTIVE;
        case SUSPENDED:
            return SUSPENDED;
        case INACTIVE:
            return INACTIVE;
        case ENTERED_IN_ERROR:
            return ENTERED_IN_ERROR;
        default:
            throw new IllegalStateException(value.name());
        }
    }

    public static CareTeamStatus of(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    public static String string(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    public static Code code(java.lang.String value) {
        return of(ValueSet.from(value));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        CareTeamStatus other = (CareTeamStatus) obj;
        return Objects.equals(id, other.id) && Objects.equals(extension, other.extension) && Objects.equals(value, other.value);
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if (result == 0) {
            result = Objects.hash(id, extension, value);
            hashCode = result;
        }
        return result;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.id(id);
        builder.extension(extension);
        builder.value(value);
        return builder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder extends Code.Builder {
        private Builder() {
            super();
        }

        @Override
        public Builder id(java.lang.String id) {
            return (Builder) super.id(id);
        }

        @Override
        public Builder extension(Extension... extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder extension(Collection<Extension> extension) {
            return (Builder) super.extension(extension);
        }

        @Override
        public Builder value(java.lang.String value) {
            return (value != null) ? (Builder) super.value(ValueSet.from(value).value()) : this;
        }

        public Builder value(ValueSet value) {
            return (value != null) ? (Builder) super.value(value.value()) : this;
        }

        @Override
        public CareTeamStatus build() {
            return new CareTeamStatus(this);
        }
    }

    public enum ValueSet {
        /**
         * Proposed
         */
        PROPOSED("proposed"),

        /**
         * Active
         */
        ACTIVE("active"),

        /**
         * Suspended
         */
        SUSPENDED("suspended"),

        /**
         * Inactive
         */
        INACTIVE("inactive"),

        /**
         * Entered in Error
         */
        ENTERED_IN_ERROR("entered-in-error");

        private final java.lang.String value;

        ValueSet(java.lang.String value) {
            this.value = value;
        }

        public java.lang.String value() {
            return value;
        }

        public static ValueSet from(java.lang.String value) {
            for (ValueSet c : ValueSet.values()) {
                if (c.value.equals(value)) {
                    return c;
                }
            }
            throw new IllegalArgumentException(value);
        }
    }
}
