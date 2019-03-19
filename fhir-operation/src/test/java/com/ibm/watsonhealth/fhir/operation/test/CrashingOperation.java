/**
 * (C) Copyright IBM Corp. 2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.operation.test;

import com.ibm.watsonhealth.fhir.model.OperationDefinition;
import com.ibm.watsonhealth.fhir.model.Parameters;
import com.ibm.watsonhealth.fhir.model.Resource;
import com.ibm.watsonhealth.fhir.operation.AbstractOperation;
import com.ibm.watsonhealth.fhir.operation.context.FHIROperationContext;
import com.ibm.watsonhealth.fhir.operation.exception.FHIROperationException;
import com.ibm.watsonhealth.fhir.persistence.FHIRPersistence;

/**
 * This class will test what happens if there is an Operation that fails to initialize.
 * There is no corresponding testcase as the Java ServiceLoader (SPI) mechanism 
 * will automatically load this service if it is configured as a service provider and available on the classpath.
 * The expected result is:
 * 1. to see an error/message explaining why this service was not loaded
 * 2. for other operations to continue working
 * @author lmsurpre
 */
public class CrashingOperation extends AbstractOperation {
    @Override
    protected OperationDefinition buildOperationDefinition() {
        throw new RuntimeException("Testing an operation that fails to initialize");
    }

    @Override
    protected Parameters doInvoke(FHIROperationContext operationContext, Class<? extends Resource> resourceType, String logicalId, String versionId,
        Parameters parameters, FHIRPersistence persistence) throws FHIROperationException {
        // do nothing
        return null;
    }
}