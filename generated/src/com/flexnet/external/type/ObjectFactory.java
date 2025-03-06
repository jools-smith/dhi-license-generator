
package com.flexnet.external.type;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.flexnet.external.type package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Entitlement_QNAME = new QName("urn:com.flexnet.external.type", "Entitlement");
    private final static QName _FileNamesRequest_QNAME = new QName("urn:com.flexnet.external.type", "FileNamesRequest");
    private final static QName _BulkEntitlement_QNAME = new QName("urn:com.flexnet.external.type", "BulkEntitlement");
    private final static QName _MaintenanceItem_QNAME = new QName("urn:com.flexnet.external.type", "MaintenanceItem");
    private final static QName _HostIdResponse_QNAME = new QName("urn:com.flexnet.external.type", "HostIdResponse");
    private final static QName _GeneratorRequest_QNAME = new QName("urn:com.flexnet.external.type", "GeneratorRequest");
    private final static QName _Id_QNAME = new QName("urn:com.flexnet.external.type", "Id");
    private final static QName _FulfillmentRecord_QNAME = new QName("urn:com.flexnet.external.type", "FulfillmentRecord");
    private final static QName _RenewalResponse_QNAME = new QName("urn:com.flexnet.external.type", "renewalResponse");
    private final static QName _FulfillmentRecordSet_QNAME = new QName("urn:com.flexnet.external.type", "FulfillmentRecordSet");
    private final static QName _VersionInfo_QNAME = new QName("urn:com.flexnet.external.type", "VersionInfo");
    private final static QName _LicGeneratorException_QNAME = new QName("urn:com.flexnet.external.type", "licGeneratorException");
    private final static QName _ConsolidatedLicenseRecord_QNAME = new QName("urn:com.flexnet.external.type", "ConsolidatedLicenseRecord");
    private final static QName _EntitlementLineItem_QNAME = new QName("urn:com.flexnet.external.type", "EntitlementLineItem");
    private final static QName _Status_QNAME = new QName("urn:com.flexnet.external.type", "Status");
    private final static QName _LicenseFileDefinitionMap_QNAME = new QName("urn:com.flexnet.external.type", "LicenseFileDefinitionMap");
    private final static QName _ProductProductCategory_QNAME = new QName("urn:com.flexnet.external.type", "productCategory");
    private final static QName _ProductHeader_QNAME = new QName("urn:com.flexnet.external.type", "header");
    private final static QName _ProductPackageVersion_QNAME = new QName("urn:com.flexnet.external.type", "packageVersion");
    private final static QName _ProductIsDateBasedPackageVersion_QNAME = new QName("urn:com.flexnet.external.type", "isDateBasedPackageVersion");
    private final static QName _ProductPackageName_QNAME = new QName("urn:com.flexnet.external.type", "packageName");
    private final static QName _ProductTrailer_QNAME = new QName("urn:com.flexnet.external.type", "trailer");
    private final static QName _ProductRequestHeaderResourceBundleKey_QNAME = new QName("urn:com.flexnet.external.type", "headerResourceBundleKey");
    private final static QName _ProductRequestTrailerResourceBundleKey_QNAME = new QName("urn:com.flexnet.external.type", "trailerResourceBundleKey");
    private final static QName _SuiteProductInfoPackageVersionFormat_QNAME = new QName("urn:com.flexnet.external.type", "packageVersionFormat");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.flexnet.external.type
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LicenseFileDefinitionMap }
     * 
     */
    public LicenseFileDefinitionMap createLicenseFileDefinitionMap() {
        return new LicenseFileDefinitionMap();
    }

    /**
     * Create an instance of {@link ConsolidatedLicenseRecord }
     * 
     */
    public ConsolidatedLicenseRecord createConsolidatedLicenseRecord() {
        return new ConsolidatedLicenseRecord();
    }

    /**
     * Create an instance of {@link PingRequest }
     * 
     */
    public PingRequest createPingRequest() {
        return new PingRequest();
    }

    /**
     * Create an instance of {@link GeneratorResponse }
     * 
     */
    public GeneratorResponse createGeneratorResponse() {
        return new GeneratorResponse();
    }

    /**
     * Create an instance of {@link LicenseFileMapItem }
     * 
     */
    public LicenseFileMapItem createLicenseFileMapItem() {
        return new LicenseFileMapItem();
    }

    /**
     * Create an instance of {@link RenewableEntitlementLineItems }
     * 
     */
    public RenewableEntitlementLineItems createRenewableEntitlementLineItems() {
        return new RenewableEntitlementLineItems();
    }

    /**
     * Create an instance of {@link RenewableEntitlementLineItem }
     * 
     */
    public RenewableEntitlementLineItem createRenewableEntitlementLineItem() {
        return new RenewableEntitlementLineItem();
    }

    /**
     * Create an instance of {@link FulfillmentRecord }
     * 
     */
    public FulfillmentRecord createFulfillmentRecord() {
        return new FulfillmentRecord();
    }

    /**
     * Create an instance of {@link FulfillmentRecordSet }
     * 
     */
    public FulfillmentRecordSet createFulfillmentRecordSet() {
        return new FulfillmentRecordSet();
    }

    /**
     * Create an instance of {@link MaintenanceItem }
     * 
     */
    public MaintenanceItem createMaintenanceItem() {
        return new MaintenanceItem();
    }

    /**
     * Create an instance of {@link ProductRequest }
     * 
     */
    public ProductRequest createProductRequest() {
        return new ProductRequest();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ProductCategory }
     * 
     */
    public ProductCategory createProductCategory() {
        return new ProductCategory();
    }

    /**
     * Create an instance of {@link ProductCategoryAttributeValue }
     * 
     */
    public ProductCategoryAttributeValue createProductCategoryAttributeValue() {
        return new ProductCategoryAttributeValue();
    }

    /**
     * Create an instance of {@link CustomAttribute }
     * 
     */
    public CustomAttribute createCustomAttribute() {
        return new CustomAttribute();
    }

    /**
     * Create an instance of {@link Feature }
     * 
     */
    public Feature createFeature() {
        return new Feature();
    }

    /**
     * Create an instance of {@link SuiteProductInfo }
     * 
     */
    public SuiteProductInfo createSuiteProductInfo() {
        return new SuiteProductInfo();
    }

    /**
     * Create an instance of {@link PartNumber }
     * 
     */
    public PartNumber createPartNumber() {
        return new PartNumber();
    }

    /**
     * Create an instance of {@link HostType }
     * 
     */
    public HostType createHostType() {
        return new HostType();
    }

    /**
     * Create an instance of {@link LicenseTechnology }
     * 
     */
    public LicenseTechnology createLicenseTechnology() {
        return new LicenseTechnology();
    }

    /**
     * Create an instance of {@link LicenseGeneratorConfig }
     * 
     */
    public LicenseGeneratorConfig createLicenseGeneratorConfig() {
        return new LicenseGeneratorConfig();
    }

    /**
     * Create an instance of {@link GeneratorRequest }
     * 
     */
    public GeneratorRequest createGeneratorRequest() {
        return new GeneratorRequest();
    }

    /**
     * Create an instance of {@link EntitlementLineItem }
     * 
     */
    public EntitlementLineItem createEntitlementLineItem() {
        return new EntitlementLineItem();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link ConsolidatedLicense }
     * 
     */
    public ConsolidatedLicense createConsolidatedLicense() {
        return new ConsolidatedLicense();
    }

    /**
     * Create an instance of {@link LicenseFileDefinitionMapItem }
     * 
     */
    public LicenseFileDefinitionMapItem createLicenseFileDefinitionMapItem() {
        return new LicenseFileDefinitionMapItem();
    }

    /**
     * Create an instance of {@link HostIdRequest }
     * 
     */
    public HostIdRequest createHostIdRequest() {
        return new HostIdRequest();
    }

    /**
     * Create an instance of {@link StringPair }
     * 
     */
    public StringPair createStringPair() {
        return new StringPair();
    }

    /**
     * Create an instance of {@link SvcException }
     * 
     */
    public SvcException createSvcException() {
        return new SvcException();
    }

    /**
     * Create an instance of {@link VersionInfo }
     * 
     */
    public VersionInfo createVersionInfo() {
        return new VersionInfo();
    }

    /**
     * Create an instance of {@link RenewalResponse }
     * 
     */
    public RenewalResponse createRenewalResponse() {
        return new RenewalResponse();
    }

    /**
     * Create an instance of {@link LicenseModelRequest }
     * 
     */
    public LicenseModelRequest createLicenseModelRequest() {
        return new LicenseModelRequest();
    }

    /**
     * Create an instance of {@link LicenseModel }
     * 
     */
    public LicenseModel createLicenseModel() {
        return new LicenseModel();
    }

    /**
     * Create an instance of {@link AttributeSet }
     * 
     */
    public AttributeSet createAttributeSet() {
        return new AttributeSet();
    }

    /**
     * Create an instance of {@link Duration }
     * 
     */
    public Duration createDuration() {
        return new Duration();
    }

    /**
     * Create an instance of {@link LicenseLifecyclePolicy }
     * 
     */
    public LicenseLifecyclePolicy createLicenseLifecyclePolicy() {
        return new LicenseLifecyclePolicy();
    }

    /**
     * Create an instance of {@link LicenseCancelPolicy }
     * 
     */
    public LicenseCancelPolicy createLicenseCancelPolicy() {
        return new LicenseCancelPolicy();
    }

    /**
     * Create an instance of {@link LicenseHostIdPolicy }
     * 
     */
    public LicenseHostIdPolicy createLicenseHostIdPolicy() {
        return new LicenseHostIdPolicy();
    }

    /**
     * Create an instance of {@link ConsolidatedLicenseResquest }
     * 
     */
    public ConsolidatedLicenseResquest createConsolidatedLicenseResquest() {
        return new ConsolidatedLicenseResquest();
    }

    /**
     * Create an instance of {@link Id }
     * 
     */
    public Id createId() {
        return new Id();
    }

    /**
     * Create an instance of {@link Entitlement }
     * 
     */
    public Entitlement createEntitlement() {
        return new Entitlement();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link BulkEntitlement }
     * 
     */
    public BulkEntitlement createBulkEntitlement() {
        return new BulkEntitlement();
    }

    /**
     * Create an instance of {@link ReinstallPolicy }
     * 
     */
    public ReinstallPolicy createReinstallPolicy() {
        return new ReinstallPolicy();
    }

    /**
     * Create an instance of {@link ExtendedPropertyMap }
     * 
     */
    public ExtendedPropertyMap createExtendedPropertyMap() {
        return new ExtendedPropertyMap();
    }

    /**
     * Create an instance of {@link CustomHostId }
     * 
     */
    public CustomHostId createCustomHostId() {
        return new CustomHostId();
    }

    /**
     * Create an instance of {@link FeatureOverride }
     * 
     */
    public FeatureOverride createFeatureOverride() {
        return new FeatureOverride();
    }

    /**
     * Create an instance of {@link LicenseTerm }
     * 
     */
    public LicenseTerm createLicenseTerm() {
        return new LicenseTerm();
    }

    /**
     * Create an instance of {@link CustomAttributeDescriptor }
     * 
     */
    public CustomAttributeDescriptor createCustomAttributeDescriptor() {
        return new CustomAttributeDescriptor();
    }

    /**
     * Create an instance of {@link LicenseHostId }
     * 
     */
    public LicenseHostId createLicenseHostId() {
        return new LicenseHostId();
    }

    /**
     * Create an instance of {@link ExtendedProperty }
     * 
     */
    public ExtendedProperty createExtendedProperty() {
        return new ExtendedProperty();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link OrganizationUnit }
     * 
     */
    public OrganizationUnit createOrganizationUnit() {
        return new OrganizationUnit();
    }

    /**
     * Create an instance of {@link ChannelPartner }
     * 
     */
    public ChannelPartner createChannelPartner() {
        return new ChannelPartner();
    }

    /**
     * Create an instance of {@link LicenseFileDefinition }
     * 
     */
    public LicenseFileDefinition createLicenseFileDefinition() {
        return new LicenseFileDefinition();
    }

    /**
     * Create an instance of {@link SimpleEntitlement }
     * 
     */
    public SimpleEntitlement createSimpleEntitlement() {
        return new SimpleEntitlement();
    }

    /**
     * Create an instance of {@link OrgUnitContact }
     * 
     */
    public OrgUnitContact createOrgUnitContact() {
        return new OrgUnitContact();
    }

    /**
     * Create an instance of {@link ExtendedPropertyMapItem }
     * 
     */
    public ExtendedPropertyMapItem createExtendedPropertyMapItem() {
        return new ExtendedPropertyMapItem();
    }

    /**
     * Create an instance of {@link ProductCategoryAttribute }
     * 
     */
    public ProductCategoryAttribute createProductCategoryAttribute() {
        return new ProductCategoryAttribute();
    }

    /**
     * Create an instance of {@link ExtendedPropertyMetadata }
     * 
     */
    public ExtendedPropertyMetadata createExtendedPropertyMetadata() {
        return new ExtendedPropertyMetadata();
    }

    /**
     * Create an instance of {@link OrgUnitUser }
     * 
     */
    public OrgUnitUser createOrgUnitUser() {
        return new OrgUnitUser();
    }

    /**
     * Create an instance of {@link LicenseRedundantServerPolicy }
     * 
     */
    public LicenseRedundantServerPolicy createLicenseRedundantServerPolicy() {
        return new LicenseRedundantServerPolicy();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entitlement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "Entitlement")
    public JAXBElement<Entitlement> createEntitlement(Entitlement value) {
        return new JAXBElement<Entitlement>(_Entitlement_QNAME, Entitlement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneratorRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "FileNamesRequest")
    public JAXBElement<GeneratorRequest> createFileNamesRequest(GeneratorRequest value) {
        return new JAXBElement<GeneratorRequest>(_FileNamesRequest_QNAME, GeneratorRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BulkEntitlement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "BulkEntitlement")
    public JAXBElement<BulkEntitlement> createBulkEntitlement(BulkEntitlement value) {
        return new JAXBElement<BulkEntitlement>(_BulkEntitlement_QNAME, BulkEntitlement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintenanceItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "MaintenanceItem")
    public JAXBElement<MaintenanceItem> createMaintenanceItem(MaintenanceItem value) {
        return new JAXBElement<MaintenanceItem>(_MaintenanceItem_QNAME, MaintenanceItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "HostIdResponse")
    public JAXBElement<String> createHostIdResponse(String value) {
        return new JAXBElement<String>(_HostIdResponse_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneratorRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "GeneratorRequest")
    public JAXBElement<GeneratorRequest> createGeneratorRequest(GeneratorRequest value) {
        return new JAXBElement<GeneratorRequest>(_GeneratorRequest_QNAME, GeneratorRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Id }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "Id")
    public JAXBElement<Id> createId(Id value) {
        return new JAXBElement<Id>(_Id_QNAME, Id.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FulfillmentRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "FulfillmentRecord")
    public JAXBElement<FulfillmentRecord> createFulfillmentRecord(FulfillmentRecord value) {
        return new JAXBElement<FulfillmentRecord>(_FulfillmentRecord_QNAME, FulfillmentRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenewalResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "renewalResponse")
    public JAXBElement<RenewalResponse> createRenewalResponse(RenewalResponse value) {
        return new JAXBElement<RenewalResponse>(_RenewalResponse_QNAME, RenewalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FulfillmentRecordSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "FulfillmentRecordSet")
    public JAXBElement<FulfillmentRecordSet> createFulfillmentRecordSet(FulfillmentRecordSet value) {
        return new JAXBElement<FulfillmentRecordSet>(_FulfillmentRecordSet_QNAME, FulfillmentRecordSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "VersionInfo")
    public JAXBElement<VersionInfo> createVersionInfo(VersionInfo value) {
        return new JAXBElement<VersionInfo>(_VersionInfo_QNAME, VersionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SvcException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "licGeneratorException")
    public JAXBElement<SvcException> createLicGeneratorException(SvcException value) {
        return new JAXBElement<SvcException>(_LicGeneratorException_QNAME, SvcException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsolidatedLicenseRecord }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "ConsolidatedLicenseRecord")
    public JAXBElement<ConsolidatedLicenseRecord> createConsolidatedLicenseRecord(ConsolidatedLicenseRecord value) {
        return new JAXBElement<ConsolidatedLicenseRecord>(_ConsolidatedLicenseRecord_QNAME, ConsolidatedLicenseRecord.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EntitlementLineItem }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "EntitlementLineItem")
    public JAXBElement<EntitlementLineItem> createEntitlementLineItem(EntitlementLineItem value) {
        return new JAXBElement<EntitlementLineItem>(_EntitlementLineItem_QNAME, EntitlementLineItem.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Status }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "Status")
    public JAXBElement<Status> createStatus(Status value) {
        return new JAXBElement<Status>(_Status_QNAME, Status.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LicenseFileDefinitionMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "LicenseFileDefinitionMap")
    public JAXBElement<LicenseFileDefinitionMap> createLicenseFileDefinitionMap(LicenseFileDefinitionMap value) {
        return new JAXBElement<LicenseFileDefinitionMap>(_LicenseFileDefinitionMap_QNAME, LicenseFileDefinitionMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "productCategory", scope = Product.class)
    public JAXBElement<ProductCategory> createProductProductCategory(ProductCategory value) {
        return new JAXBElement<ProductCategory>(_ProductProductCategory_QNAME, ProductCategory.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "header", scope = Product.class)
    public JAXBElement<String> createProductHeader(String value) {
        return new JAXBElement<String>(_ProductHeader_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "packageVersion", scope = Product.class)
    public JAXBElement<String> createProductPackageVersion(String value) {
        return new JAXBElement<String>(_ProductPackageVersion_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "isDateBasedPackageVersion", scope = Product.class)
    public JAXBElement<Boolean> createProductIsDateBasedPackageVersion(Boolean value) {
        return new JAXBElement<Boolean>(_ProductIsDateBasedPackageVersion_QNAME, Boolean.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "packageName", scope = Product.class)
    public JAXBElement<String> createProductPackageName(String value) {
        return new JAXBElement<String>(_ProductPackageName_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "trailer", scope = Product.class)
    public JAXBElement<String> createProductTrailer(String value) {
        return new JAXBElement<String>(_ProductTrailer_QNAME, String.class, Product.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "headerResourceBundleKey", scope = ProductRequest.class)
    public JAXBElement<String> createProductRequestHeaderResourceBundleKey(String value) {
        return new JAXBElement<String>(_ProductRequestHeaderResourceBundleKey_QNAME, String.class, ProductRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "trailerResourceBundleKey", scope = ProductRequest.class)
    public JAXBElement<String> createProductRequestTrailerResourceBundleKey(String value) {
        return new JAXBElement<String>(_ProductRequestTrailerResourceBundleKey_QNAME, String.class, ProductRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "packageVersion", scope = SuiteProductInfo.class)
    public JAXBElement<String> createSuiteProductInfoPackageVersion(String value) {
        return new JAXBElement<String>(_ProductPackageVersion_QNAME, String.class, SuiteProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "isDateBasedPackageVersion", scope = SuiteProductInfo.class)
    public JAXBElement<Boolean> createSuiteProductInfoIsDateBasedPackageVersion(Boolean value) {
        return new JAXBElement<Boolean>(_ProductIsDateBasedPackageVersion_QNAME, Boolean.class, SuiteProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "packageName", scope = SuiteProductInfo.class)
    public JAXBElement<String> createSuiteProductInfoPackageName(String value) {
        return new JAXBElement<String>(_ProductPackageName_QNAME, String.class, SuiteProductInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:com.flexnet.external.type", name = "packageVersionFormat", scope = SuiteProductInfo.class)
    public JAXBElement<String> createSuiteProductInfoPackageVersionFormat(String value) {
        return new JAXBElement<String>(_SuiteProductInfoPackageVersionFormat_QNAME, String.class, SuiteProductInfo.class, value);
    }

}
