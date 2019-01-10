package com.microsoft.bingads.v12.api.test.entities.adgroup_similar_remarketing_list.read;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.v12.api.test.entities.adgroup_similar_remarketing_list.BulkAdGroupSimilarRemarketingListAssociationTest;
import com.microsoft.bingads.v12.bulk.entities.BulkAdGroupSimilarRemarketingListAssociation;

public class BulkAdGroupSimilarRemarketingListAssociationReadAudienceTest extends BulkAdGroupSimilarRemarketingListAssociationTest {

    @Parameter(value = 1)
    public String expectedResult;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {"Test Audience 1", "Test Audience 1"},
            {"", ""},
            {null, null}
        });
    }

    @Test
    public void testRead() {
        this.<String>testReadProperty("Audience", this.datum, this.expectedResult, new Function<BulkAdGroupSimilarRemarketingListAssociation, String>() {
            @Override
            public String apply(BulkAdGroupSimilarRemarketingListAssociation c) {
                return c.getAudienceName();
            }
        });
    }
}
