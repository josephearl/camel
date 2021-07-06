/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DebeziumPostgresEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DebeziumPostgresEndpoint target = (DebeziumPostgresEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": target.getConfiguration().setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "binaryhandlingmode":
        case "binaryHandlingMode": target.getConfiguration().setBinaryHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "columnblacklist":
        case "columnBlacklist": target.getConfiguration().setColumnBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "columnexcludelist":
        case "columnExcludeList": target.getConfiguration().setColumnExcludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "columnincludelist":
        case "columnIncludeList": target.getConfiguration().setColumnIncludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "columnpropagatesourcetype":
        case "columnPropagateSourceType": target.getConfiguration().setColumnPropagateSourceType(property(camelContext, java.lang.String.class, value)); return true;
        case "columnwhitelist":
        case "columnWhitelist": target.getConfiguration().setColumnWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "converters": target.getConfiguration().setConverters(property(camelContext, java.lang.String.class, value)); return true;
        case "databasedbname":
        case "databaseDbname": target.getConfiguration().setDatabaseDbname(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": target.getConfiguration().setDatabaseHistoryFileFilename(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehostname":
        case "databaseHostname": target.getConfiguration().setDatabaseHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseinitialstatements":
        case "databaseInitialStatements": target.getConfiguration().setDatabaseInitialStatements(property(camelContext, java.lang.String.class, value)); return true;
        case "databasepassword":
        case "databasePassword": target.getConfiguration().setDatabasePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseport":
        case "databasePort": target.getConfiguration().setDatabasePort(property(camelContext, int.class, value)); return true;
        case "databaseservername":
        case "databaseServerName": target.getConfiguration().setDatabaseServerName(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslcert":
        case "databaseSslcert": target.getConfiguration().setDatabaseSslcert(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslfactory":
        case "databaseSslfactory": target.getConfiguration().setDatabaseSslfactory(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslkey":
        case "databaseSslkey": target.getConfiguration().setDatabaseSslkey(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslmode":
        case "databaseSslmode": target.getConfiguration().setDatabaseSslmode(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslpassword":
        case "databaseSslpassword": target.getConfiguration().setDatabaseSslpassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslrootcert":
        case "databaseSslrootcert": target.getConfiguration().setDatabaseSslrootcert(property(camelContext, java.lang.String.class, value)); return true;
        case "databasetcpkeepalive":
        case "databaseTcpkeepalive": target.getConfiguration().setDatabaseTcpkeepalive(property(camelContext, boolean.class, value)); return true;
        case "databaseuser":
        case "databaseUser": target.getConfiguration().setDatabaseUser(property(camelContext, java.lang.String.class, value)); return true;
        case "datatypepropagatesourcetype":
        case "datatypePropagateSourceType": target.getConfiguration().setDatatypePropagateSourceType(property(camelContext, java.lang.String.class, value)); return true;
        case "decimalhandlingmode":
        case "decimalHandlingMode": target.getConfiguration().setDecimalHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": target.getConfiguration().setEventProcessingFailureHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "heartbeatactionquery":
        case "heartbeatActionQuery": target.getConfiguration().setHeartbeatActionQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": target.getConfiguration().setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": target.getConfiguration().setHeartbeatTopicsPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "hstorehandlingmode":
        case "hstoreHandlingMode": target.getConfiguration().setHstoreHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "includeunknowndatatypes":
        case "includeUnknownDatatypes": target.getConfiguration().setIncludeUnknownDatatypes(property(camelContext, boolean.class, value)); return true;
        case "incrementalsnapshotchunksize":
        case "incrementalSnapshotChunkSize": target.getConfiguration().setIncrementalSnapshotChunkSize(property(camelContext, int.class, value)); return true;
        case "internalkeyconverter":
        case "internalKeyConverter": target.getConfiguration().setInternalKeyConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "internalvalueconverter":
        case "internalValueConverter": target.getConfiguration().setInternalValueConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "intervalhandlingmode":
        case "intervalHandlingMode": target.getConfiguration().setIntervalHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbatchsize":
        case "maxBatchSize": target.getConfiguration().setMaxBatchSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesize":
        case "maxQueueSize": target.getConfiguration().setMaxQueueSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesizeinbytes":
        case "maxQueueSizeInBytes": target.getConfiguration().setMaxQueueSizeInBytes(property(camelContext, long.class, value)); return true;
        case "messagekeycolumns":
        case "messageKeyColumns": target.getConfiguration().setMessageKeyColumns(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": target.getConfiguration().setOffsetCommitPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": target.getConfiguration().setOffsetCommitTimeoutMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": target.getConfiguration().setOffsetFlushIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetstorage":
        case "offsetStorage": target.getConfiguration().setOffsetStorage(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragefilename":
        case "offsetStorageFileName": target.getConfiguration().setOffsetStorageFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": target.getConfiguration().setOffsetStoragePartitions(property(camelContext, int.class, value)); return true;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": target.getConfiguration().setOffsetStorageReplicationFactor(property(camelContext, int.class, value)); return true;
        case "offsetstoragetopic":
        case "offsetStorageTopic": target.getConfiguration().setOffsetStorageTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "pluginname":
        case "pluginName": target.getConfiguration().setPluginName(property(camelContext, java.lang.String.class, value)); return true;
        case "pollintervalms":
        case "pollIntervalMs": target.getConfiguration().setPollIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "providetransactionmetadata":
        case "provideTransactionMetadata": target.getConfiguration().setProvideTransactionMetadata(property(camelContext, boolean.class, value)); return true;
        case "publicationautocreatemode":
        case "publicationAutocreateMode": target.getConfiguration().setPublicationAutocreateMode(property(camelContext, java.lang.String.class, value)); return true;
        case "publicationname":
        case "publicationName": target.getConfiguration().setPublicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "queryfetchsize":
        case "queryFetchSize": target.getConfiguration().setQueryFetchSize(property(camelContext, int.class, value)); return true;
        case "retriablerestartconnectorwaitms":
        case "retriableRestartConnectorWaitMs": target.getConfiguration().setRetriableRestartConnectorWaitMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "sanitizefieldnames":
        case "sanitizeFieldNames": target.getConfiguration().setSanitizeFieldNames(property(camelContext, boolean.class, value)); return true;
        case "schemablacklist":
        case "schemaBlacklist": target.getConfiguration().setSchemaBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "schemaexcludelist":
        case "schemaExcludeList": target.getConfiguration().setSchemaExcludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "schemaincludelist":
        case "schemaIncludeList": target.getConfiguration().setSchemaIncludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "schemarefreshmode":
        case "schemaRefreshMode": target.getConfiguration().setSchemaRefreshMode(property(camelContext, java.lang.String.class, value)); return true;
        case "schemawhitelist":
        case "schemaWhitelist": target.getConfiguration().setSchemaWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "signaldatacollection":
        case "signalDataCollection": target.getConfiguration().setSignalDataCollection(property(camelContext, java.lang.String.class, value)); return true;
        case "skippedoperations":
        case "skippedOperations": target.getConfiguration().setSkippedOperations(property(camelContext, java.lang.String.class, value)); return true;
        case "slotdroponstop":
        case "slotDropOnStop": target.getConfiguration().setSlotDropOnStop(property(camelContext, boolean.class, value)); return true;
        case "slotmaxretries":
        case "slotMaxRetries": target.getConfiguration().setSlotMaxRetries(property(camelContext, int.class, value)); return true;
        case "slotname":
        case "slotName": target.getConfiguration().setSlotName(property(camelContext, java.lang.String.class, value)); return true;
        case "slotretrydelayms":
        case "slotRetryDelayMs": target.getConfiguration().setSlotRetryDelayMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "slotstreamparams":
        case "slotStreamParams": target.getConfiguration().setSlotStreamParams(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotcustomclass":
        case "snapshotCustomClass": target.getConfiguration().setSnapshotCustomClass(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotdelayms":
        case "snapshotDelayMs": target.getConfiguration().setSnapshotDelayMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "snapshotfetchsize":
        case "snapshotFetchSize": target.getConfiguration().setSnapshotFetchSize(property(camelContext, int.class, value)); return true;
        case "snapshotincludecollectionlist":
        case "snapshotIncludeCollectionList": target.getConfiguration().setSnapshotIncludeCollectionList(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": target.getConfiguration().setSnapshotLockTimeoutMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "snapshotmaxthreads":
        case "snapshotMaxThreads": target.getConfiguration().setSnapshotMaxThreads(property(camelContext, int.class, value)); return true;
        case "snapshotmode":
        case "snapshotMode": target.getConfiguration().setSnapshotMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": target.getConfiguration().setSnapshotSelectStatementOverrides(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcestructversion":
        case "sourceStructVersion": target.getConfiguration().setSourceStructVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "statusupdateintervalms":
        case "statusUpdateIntervalMs": target.getConfiguration().setStatusUpdateIntervalMs(property(camelContext, int.class, value)); return true;
        case "tableblacklist":
        case "tableBlacklist": target.getConfiguration().setTableBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "tableexcludelist":
        case "tableExcludeList": target.getConfiguration().setTableExcludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": target.getConfiguration().setTableIgnoreBuiltin(property(camelContext, boolean.class, value)); return true;
        case "tableincludelist":
        case "tableIncludeList": target.getConfiguration().setTableIncludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "tablewhitelist":
        case "tableWhitelist": target.getConfiguration().setTableWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "timeprecisionmode":
        case "timePrecisionMode": target.getConfiguration().setTimePrecisionMode(property(camelContext, java.lang.String.class, value)); return true;
        case "toastedvalueplaceholder":
        case "toastedValuePlaceholder": target.getConfiguration().setToastedValuePlaceholder(property(camelContext, java.lang.String.class, value)); return true;
        case "tombstonesondelete":
        case "tombstonesOnDelete": target.getConfiguration().setTombstonesOnDelete(property(camelContext, boolean.class, value)); return true;
        case "xminfetchintervalms":
        case "xminFetchIntervalMs": target.getConfiguration().setXminFetchIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return java.util.Map.class;
        case "binaryhandlingmode":
        case "binaryHandlingMode": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "columnblacklist":
        case "columnBlacklist": return java.lang.String.class;
        case "columnexcludelist":
        case "columnExcludeList": return java.lang.String.class;
        case "columnincludelist":
        case "columnIncludeList": return java.lang.String.class;
        case "columnpropagatesourcetype":
        case "columnPropagateSourceType": return java.lang.String.class;
        case "columnwhitelist":
        case "columnWhitelist": return java.lang.String.class;
        case "converters": return java.lang.String.class;
        case "databasedbname":
        case "databaseDbname": return java.lang.String.class;
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": return java.lang.String.class;
        case "databasehostname":
        case "databaseHostname": return java.lang.String.class;
        case "databaseinitialstatements":
        case "databaseInitialStatements": return java.lang.String.class;
        case "databasepassword":
        case "databasePassword": return java.lang.String.class;
        case "databaseport":
        case "databasePort": return int.class;
        case "databaseservername":
        case "databaseServerName": return java.lang.String.class;
        case "databasesslcert":
        case "databaseSslcert": return java.lang.String.class;
        case "databasesslfactory":
        case "databaseSslfactory": return java.lang.String.class;
        case "databasesslkey":
        case "databaseSslkey": return java.lang.String.class;
        case "databasesslmode":
        case "databaseSslmode": return java.lang.String.class;
        case "databasesslpassword":
        case "databaseSslpassword": return java.lang.String.class;
        case "databasesslrootcert":
        case "databaseSslrootcert": return java.lang.String.class;
        case "databasetcpkeepalive":
        case "databaseTcpkeepalive": return boolean.class;
        case "databaseuser":
        case "databaseUser": return java.lang.String.class;
        case "datatypepropagatesourcetype":
        case "datatypePropagateSourceType": return java.lang.String.class;
        case "decimalhandlingmode":
        case "decimalHandlingMode": return java.lang.String.class;
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "heartbeatactionquery":
        case "heartbeatActionQuery": return java.lang.String.class;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return int.class;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": return java.lang.String.class;
        case "hstorehandlingmode":
        case "hstoreHandlingMode": return java.lang.String.class;
        case "includeunknowndatatypes":
        case "includeUnknownDatatypes": return boolean.class;
        case "incrementalsnapshotchunksize":
        case "incrementalSnapshotChunkSize": return int.class;
        case "internalkeyconverter":
        case "internalKeyConverter": return java.lang.String.class;
        case "internalvalueconverter":
        case "internalValueConverter": return java.lang.String.class;
        case "intervalhandlingmode":
        case "intervalHandlingMode": return java.lang.String.class;
        case "maxbatchsize":
        case "maxBatchSize": return int.class;
        case "maxqueuesize":
        case "maxQueueSize": return int.class;
        case "maxqueuesizeinbytes":
        case "maxQueueSizeInBytes": return long.class;
        case "messagekeycolumns":
        case "messageKeyColumns": return java.lang.String.class;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": return java.lang.String.class;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": return long.class;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": return long.class;
        case "offsetstorage":
        case "offsetStorage": return java.lang.String.class;
        case "offsetstoragefilename":
        case "offsetStorageFileName": return java.lang.String.class;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": return int.class;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": return int.class;
        case "offsetstoragetopic":
        case "offsetStorageTopic": return java.lang.String.class;
        case "pluginname":
        case "pluginName": return java.lang.String.class;
        case "pollintervalms":
        case "pollIntervalMs": return long.class;
        case "providetransactionmetadata":
        case "provideTransactionMetadata": return boolean.class;
        case "publicationautocreatemode":
        case "publicationAutocreateMode": return java.lang.String.class;
        case "publicationname":
        case "publicationName": return java.lang.String.class;
        case "queryfetchsize":
        case "queryFetchSize": return int.class;
        case "retriablerestartconnectorwaitms":
        case "retriableRestartConnectorWaitMs": return long.class;
        case "sanitizefieldnames":
        case "sanitizeFieldNames": return boolean.class;
        case "schemablacklist":
        case "schemaBlacklist": return java.lang.String.class;
        case "schemaexcludelist":
        case "schemaExcludeList": return java.lang.String.class;
        case "schemaincludelist":
        case "schemaIncludeList": return java.lang.String.class;
        case "schemarefreshmode":
        case "schemaRefreshMode": return java.lang.String.class;
        case "schemawhitelist":
        case "schemaWhitelist": return java.lang.String.class;
        case "signaldatacollection":
        case "signalDataCollection": return java.lang.String.class;
        case "skippedoperations":
        case "skippedOperations": return java.lang.String.class;
        case "slotdroponstop":
        case "slotDropOnStop": return boolean.class;
        case "slotmaxretries":
        case "slotMaxRetries": return int.class;
        case "slotname":
        case "slotName": return java.lang.String.class;
        case "slotretrydelayms":
        case "slotRetryDelayMs": return long.class;
        case "slotstreamparams":
        case "slotStreamParams": return java.lang.String.class;
        case "snapshotcustomclass":
        case "snapshotCustomClass": return java.lang.String.class;
        case "snapshotdelayms":
        case "snapshotDelayMs": return long.class;
        case "snapshotfetchsize":
        case "snapshotFetchSize": return int.class;
        case "snapshotincludecollectionlist":
        case "snapshotIncludeCollectionList": return java.lang.String.class;
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": return long.class;
        case "snapshotmaxthreads":
        case "snapshotMaxThreads": return int.class;
        case "snapshotmode":
        case "snapshotMode": return java.lang.String.class;
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": return java.lang.String.class;
        case "sourcestructversion":
        case "sourceStructVersion": return java.lang.String.class;
        case "statusupdateintervalms":
        case "statusUpdateIntervalMs": return int.class;
        case "tableblacklist":
        case "tableBlacklist": return java.lang.String.class;
        case "tableexcludelist":
        case "tableExcludeList": return java.lang.String.class;
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": return boolean.class;
        case "tableincludelist":
        case "tableIncludeList": return java.lang.String.class;
        case "tablewhitelist":
        case "tableWhitelist": return java.lang.String.class;
        case "timeprecisionmode":
        case "timePrecisionMode": return java.lang.String.class;
        case "toastedvalueplaceholder":
        case "toastedValuePlaceholder": return java.lang.String.class;
        case "tombstonesondelete":
        case "tombstonesOnDelete": return boolean.class;
        case "xminfetchintervalms":
        case "xminFetchIntervalMs": return long.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DebeziumPostgresEndpoint target = (DebeziumPostgresEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return target.getConfiguration().getAdditionalProperties();
        case "binaryhandlingmode":
        case "binaryHandlingMode": return target.getConfiguration().getBinaryHandlingMode();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "columnblacklist":
        case "columnBlacklist": return target.getConfiguration().getColumnBlacklist();
        case "columnexcludelist":
        case "columnExcludeList": return target.getConfiguration().getColumnExcludeList();
        case "columnincludelist":
        case "columnIncludeList": return target.getConfiguration().getColumnIncludeList();
        case "columnpropagatesourcetype":
        case "columnPropagateSourceType": return target.getConfiguration().getColumnPropagateSourceType();
        case "columnwhitelist":
        case "columnWhitelist": return target.getConfiguration().getColumnWhitelist();
        case "converters": return target.getConfiguration().getConverters();
        case "databasedbname":
        case "databaseDbname": return target.getConfiguration().getDatabaseDbname();
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": return target.getConfiguration().getDatabaseHistoryFileFilename();
        case "databasehostname":
        case "databaseHostname": return target.getConfiguration().getDatabaseHostname();
        case "databaseinitialstatements":
        case "databaseInitialStatements": return target.getConfiguration().getDatabaseInitialStatements();
        case "databasepassword":
        case "databasePassword": return target.getConfiguration().getDatabasePassword();
        case "databaseport":
        case "databasePort": return target.getConfiguration().getDatabasePort();
        case "databaseservername":
        case "databaseServerName": return target.getConfiguration().getDatabaseServerName();
        case "databasesslcert":
        case "databaseSslcert": return target.getConfiguration().getDatabaseSslcert();
        case "databasesslfactory":
        case "databaseSslfactory": return target.getConfiguration().getDatabaseSslfactory();
        case "databasesslkey":
        case "databaseSslkey": return target.getConfiguration().getDatabaseSslkey();
        case "databasesslmode":
        case "databaseSslmode": return target.getConfiguration().getDatabaseSslmode();
        case "databasesslpassword":
        case "databaseSslpassword": return target.getConfiguration().getDatabaseSslpassword();
        case "databasesslrootcert":
        case "databaseSslrootcert": return target.getConfiguration().getDatabaseSslrootcert();
        case "databasetcpkeepalive":
        case "databaseTcpkeepalive": return target.getConfiguration().isDatabaseTcpkeepalive();
        case "databaseuser":
        case "databaseUser": return target.getConfiguration().getDatabaseUser();
        case "datatypepropagatesourcetype":
        case "datatypePropagateSourceType": return target.getConfiguration().getDatatypePropagateSourceType();
        case "decimalhandlingmode":
        case "decimalHandlingMode": return target.getConfiguration().getDecimalHandlingMode();
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": return target.getConfiguration().getEventProcessingFailureHandlingMode();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "heartbeatactionquery":
        case "heartbeatActionQuery": return target.getConfiguration().getHeartbeatActionQuery();
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return target.getConfiguration().getHeartbeatIntervalMs();
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": return target.getConfiguration().getHeartbeatTopicsPrefix();
        case "hstorehandlingmode":
        case "hstoreHandlingMode": return target.getConfiguration().getHstoreHandlingMode();
        case "includeunknowndatatypes":
        case "includeUnknownDatatypes": return target.getConfiguration().isIncludeUnknownDatatypes();
        case "incrementalsnapshotchunksize":
        case "incrementalSnapshotChunkSize": return target.getConfiguration().getIncrementalSnapshotChunkSize();
        case "internalkeyconverter":
        case "internalKeyConverter": return target.getConfiguration().getInternalKeyConverter();
        case "internalvalueconverter":
        case "internalValueConverter": return target.getConfiguration().getInternalValueConverter();
        case "intervalhandlingmode":
        case "intervalHandlingMode": return target.getConfiguration().getIntervalHandlingMode();
        case "maxbatchsize":
        case "maxBatchSize": return target.getConfiguration().getMaxBatchSize();
        case "maxqueuesize":
        case "maxQueueSize": return target.getConfiguration().getMaxQueueSize();
        case "maxqueuesizeinbytes":
        case "maxQueueSizeInBytes": return target.getConfiguration().getMaxQueueSizeInBytes();
        case "messagekeycolumns":
        case "messageKeyColumns": return target.getConfiguration().getMessageKeyColumns();
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": return target.getConfiguration().getOffsetCommitPolicy();
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": return target.getConfiguration().getOffsetCommitTimeoutMs();
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": return target.getConfiguration().getOffsetFlushIntervalMs();
        case "offsetstorage":
        case "offsetStorage": return target.getConfiguration().getOffsetStorage();
        case "offsetstoragefilename":
        case "offsetStorageFileName": return target.getConfiguration().getOffsetStorageFileName();
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": return target.getConfiguration().getOffsetStoragePartitions();
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": return target.getConfiguration().getOffsetStorageReplicationFactor();
        case "offsetstoragetopic":
        case "offsetStorageTopic": return target.getConfiguration().getOffsetStorageTopic();
        case "pluginname":
        case "pluginName": return target.getConfiguration().getPluginName();
        case "pollintervalms":
        case "pollIntervalMs": return target.getConfiguration().getPollIntervalMs();
        case "providetransactionmetadata":
        case "provideTransactionMetadata": return target.getConfiguration().isProvideTransactionMetadata();
        case "publicationautocreatemode":
        case "publicationAutocreateMode": return target.getConfiguration().getPublicationAutocreateMode();
        case "publicationname":
        case "publicationName": return target.getConfiguration().getPublicationName();
        case "queryfetchsize":
        case "queryFetchSize": return target.getConfiguration().getQueryFetchSize();
        case "retriablerestartconnectorwaitms":
        case "retriableRestartConnectorWaitMs": return target.getConfiguration().getRetriableRestartConnectorWaitMs();
        case "sanitizefieldnames":
        case "sanitizeFieldNames": return target.getConfiguration().isSanitizeFieldNames();
        case "schemablacklist":
        case "schemaBlacklist": return target.getConfiguration().getSchemaBlacklist();
        case "schemaexcludelist":
        case "schemaExcludeList": return target.getConfiguration().getSchemaExcludeList();
        case "schemaincludelist":
        case "schemaIncludeList": return target.getConfiguration().getSchemaIncludeList();
        case "schemarefreshmode":
        case "schemaRefreshMode": return target.getConfiguration().getSchemaRefreshMode();
        case "schemawhitelist":
        case "schemaWhitelist": return target.getConfiguration().getSchemaWhitelist();
        case "signaldatacollection":
        case "signalDataCollection": return target.getConfiguration().getSignalDataCollection();
        case "skippedoperations":
        case "skippedOperations": return target.getConfiguration().getSkippedOperations();
        case "slotdroponstop":
        case "slotDropOnStop": return target.getConfiguration().isSlotDropOnStop();
        case "slotmaxretries":
        case "slotMaxRetries": return target.getConfiguration().getSlotMaxRetries();
        case "slotname":
        case "slotName": return target.getConfiguration().getSlotName();
        case "slotretrydelayms":
        case "slotRetryDelayMs": return target.getConfiguration().getSlotRetryDelayMs();
        case "slotstreamparams":
        case "slotStreamParams": return target.getConfiguration().getSlotStreamParams();
        case "snapshotcustomclass":
        case "snapshotCustomClass": return target.getConfiguration().getSnapshotCustomClass();
        case "snapshotdelayms":
        case "snapshotDelayMs": return target.getConfiguration().getSnapshotDelayMs();
        case "snapshotfetchsize":
        case "snapshotFetchSize": return target.getConfiguration().getSnapshotFetchSize();
        case "snapshotincludecollectionlist":
        case "snapshotIncludeCollectionList": return target.getConfiguration().getSnapshotIncludeCollectionList();
        case "snapshotlocktimeoutms":
        case "snapshotLockTimeoutMs": return target.getConfiguration().getSnapshotLockTimeoutMs();
        case "snapshotmaxthreads":
        case "snapshotMaxThreads": return target.getConfiguration().getSnapshotMaxThreads();
        case "snapshotmode":
        case "snapshotMode": return target.getConfiguration().getSnapshotMode();
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": return target.getConfiguration().getSnapshotSelectStatementOverrides();
        case "sourcestructversion":
        case "sourceStructVersion": return target.getConfiguration().getSourceStructVersion();
        case "statusupdateintervalms":
        case "statusUpdateIntervalMs": return target.getConfiguration().getStatusUpdateIntervalMs();
        case "tableblacklist":
        case "tableBlacklist": return target.getConfiguration().getTableBlacklist();
        case "tableexcludelist":
        case "tableExcludeList": return target.getConfiguration().getTableExcludeList();
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": return target.getConfiguration().isTableIgnoreBuiltin();
        case "tableincludelist":
        case "tableIncludeList": return target.getConfiguration().getTableIncludeList();
        case "tablewhitelist":
        case "tableWhitelist": return target.getConfiguration().getTableWhitelist();
        case "timeprecisionmode":
        case "timePrecisionMode": return target.getConfiguration().getTimePrecisionMode();
        case "toastedvalueplaceholder":
        case "toastedValuePlaceholder": return target.getConfiguration().getToastedValuePlaceholder();
        case "tombstonesondelete":
        case "tombstonesOnDelete": return target.getConfiguration().isTombstonesOnDelete();
        case "xminfetchintervalms":
        case "xminFetchIntervalMs": return target.getConfiguration().getXminFetchIntervalMs();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return java.lang.Object.class;
        default: return null;
        }
    }
}

