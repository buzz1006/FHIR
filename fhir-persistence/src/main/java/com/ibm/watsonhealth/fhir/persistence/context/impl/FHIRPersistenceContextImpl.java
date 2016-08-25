/**
 * (C) Copyright IBM Corp. 2016,2017,2019
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.ibm.watsonhealth.fhir.persistence.context.impl;

import com.ibm.watsonhealth.fhir.persistence.context.FHIRHistoryContext;
import com.ibm.watsonhealth.fhir.persistence.context.FHIRPersistenceContext;
import com.ibm.watsonhealth.fhir.persistence.interceptor.FHIRPersistenceEvent;
import com.ibm.watsonhealth.fhir.search.context.FHIRSearchContext;

/**
 * This class provides a concrete implementation of the FHIRPersistenceContext
 * interface and is used to pass request context-related information to the persistence layer.
 */
public class FHIRPersistenceContextImpl implements FHIRPersistenceContext {

    private FHIRPersistenceEvent persistenceEvent;
    private FHIRHistoryContext historyContext;
    private FHIRSearchContext searchContext;
    
    public FHIRPersistenceContextImpl(FHIRPersistenceEvent pe) {
        this.persistenceEvent = pe;
    }
    public FHIRPersistenceContextImpl(FHIRPersistenceEvent pe, FHIRHistoryContext hc) {
        this.persistenceEvent = pe;
        this.historyContext = hc;
    }
    public FHIRPersistenceContextImpl(FHIRPersistenceEvent pe, FHIRSearchContext sc) {
        this.persistenceEvent = pe;
        this.searchContext = sc;
    }

    /* (non-Javadoc)
     * @see com.ibm.watsonhealth.fhir.persistence.context.FHIRPersistenceContext#getPersistenceEvent()
     */
    @Override
    public FHIRPersistenceEvent getPersistenceEvent() {
        return this.persistenceEvent;
    }

    /* (non-Javadoc)
     * @see com.ibm.watsonhealth.fhir.persistence.context.FHIRPersistenceContext#getHistoryContext()
     */
    @Override
    public FHIRHistoryContext getHistoryContext() {
        return this.historyContext;
    }

    /* (non-Javadoc)
     * @see com.ibm.watsonhealth.fhir.persistence.context.FHIRPersistenceContext#getSearchContext()
     */
    @Override
    public FHIRSearchContext getSearchContext() {
        return this.searchContext;
    }
}