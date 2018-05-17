package com.microsoft.bingads.v12.bulk.entities;

import java.util.Collections;

import com.microsoft.bingads.v12.bulk.BulkFileReader;
import com.microsoft.bingads.v12.bulk.BulkFileWriter;
import com.microsoft.bingads.v12.bulk.BulkOperation;
import com.microsoft.bingads.v12.bulk.BulkServiceManager;
import com.microsoft.bingads.v12.campaignmanagement.ProfileCriterion;
import com.microsoft.bingads.v12.campaignmanagement.ProfileType;

/**
 * Represents a company name criterion that is assigned to an ad group. Each company name criterion can be read or written in a bulk file.
 *
 * <p>
 *     For more information, see Ad Group CompanyName Criterion at
 *     <a href="https://go.microsoft.com/fwlink/?linkid=846127>https://go.microsoft.com/fwlink/?linkid=846127</a>.
 * </p>
 *
 * @see BulkServiceManager
 * @see BulkOperation
 * @see BulkFileReader
 * @see BulkFileWriter
 */
public class BulkAdGroupCompanyNameCriterion extends BulkAdGroupProfileCriterion {
	
    @Override
    public void setProfileType(ProfileCriterion criterion) {
        criterion.setProfileType(Collections.singleton(ProfileType.COMPANY_NAME));
    }
    
    
}
