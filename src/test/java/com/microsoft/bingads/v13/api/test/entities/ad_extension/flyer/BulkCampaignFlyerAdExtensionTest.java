package com.microsoft.bingads.v13.api.test.entities.ad_extension.flyer;

import java.util.Map;

import com.microsoft.bingads.internal.functionalinterfaces.BiConsumer;
import com.microsoft.bingads.internal.functionalinterfaces.Function;
import com.microsoft.bingads.internal.functionalinterfaces.Supplier;
import com.microsoft.bingads.v13.api.test.entities.BulkEntityTest;
import com.microsoft.bingads.v13.bulk.entities.BulkCampaignFlyerAdExtension;

public abstract class BulkCampaignFlyerAdExtensionTest extends BulkEntityTest<BulkCampaignFlyerAdExtension> {
    @Override
    protected void onEntityCreation(BulkCampaignFlyerAdExtension entity) {
    }

    @Override
    protected <TProperty> void testWriteProperty(
            String header,
            String expectedRowValue, TProperty propertyValue,
            BiConsumer<BulkCampaignFlyerAdExtension, TProperty> setFunc
    ) {
        this.testWriteProperty(header, expectedRowValue, propertyValue, setFunc, new Supplier<BulkCampaignFlyerAdExtension>() {
            @Override
            public BulkCampaignFlyerAdExtension get() {
                return new BulkCampaignFlyerAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            String header,
            String input,
            TProperty expectedResult,
            Function<BulkCampaignFlyerAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(header, input, expectedResult, actualValueFunc, new Supplier<BulkCampaignFlyerAdExtension>() {
            @Override
            public BulkCampaignFlyerAdExtension get() {
                return new BulkCampaignFlyerAdExtension();
            }
        });
    }

    @Override
    protected <TProperty> void testReadProperty(
            Map<String, String> rowValues,
            TProperty expectedResult,
            Function<BulkCampaignFlyerAdExtension, TProperty> actualValueFunc
    ) {
        this.testReadProperty(rowValues, expectedResult, actualValueFunc, new Supplier<BulkCampaignFlyerAdExtension>() {
            @Override
            public BulkCampaignFlyerAdExtension get() {
                return new BulkCampaignFlyerAdExtension();
            }
        });
    }
}
