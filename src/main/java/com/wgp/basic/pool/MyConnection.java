package com.wgp.basic.pool;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.Executor;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.log.Log;

/**
 * 自定义连接类，在该类中可自己实现对数据库的连接
 *
 * @date: 2021/6/11 10:02 上午
 * @author: Mr_wenpan@163.com
 */
public class MyConnection implements Connection {

    String name;

    public MyConnection(String name) {
        this.name = name;
    }

    @Override
    public void changeUser(String s, String s1) throws SQLException {

    }

    @Override
    public void clearHasTriedMaster() {

    }

    @Override
    public PreparedStatement clientPrepareStatement(String s) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement clientPrepareStatement(String s, int i) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement clientPrepareStatement(String s, int i, int i1) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement clientPrepareStatement(String s, int[] ints) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement clientPrepareStatement(String s, int i, int i1, int i2) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement clientPrepareStatement(String s, String[] strings) throws SQLException {
        return null;
    }

    @Override
    public int getActiveStatementCount() {
        return 0;
    }

    @Override
    public long getIdleFor() {
        return 0;
    }

    @Override
    public Log getLog() throws SQLException {
        return null;
    }

    @Override
    public String getServerCharacterEncoding() {
        return null;
    }

    @Override
    public TimeZone getServerTimezoneTZ() {
        return null;
    }

    @Override
    public String getStatementComment() {
        return null;
    }

    @Override
    public boolean hasTriedMaster() {
        return false;
    }

    @Override
    public boolean isInGlobalTx() {
        return false;
    }

    @Override
    public boolean isMasterConnection() {
        return false;
    }

    @Override
    public boolean isNoBackslashEscapesSet() {
        return false;
    }

    @Override
    public boolean lowerCaseTableNames() {
        return false;
    }

    @Override
    public boolean parserKnowsUnicode() {
        return false;
    }

    @Override
    public void ping() throws SQLException {

    }

    @Override
    public void resetServerState() throws SQLException {

    }

    @Override
    public PreparedStatement serverPrepareStatement(String s) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement serverPrepareStatement(String s, int i) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement serverPrepareStatement(String s, int i, int i1) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement serverPrepareStatement(String s, int i, int i1, int i2) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement serverPrepareStatement(String s, int[] ints) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement serverPrepareStatement(String s, String[] strings) throws SQLException {
        return null;
    }

    @Override
    public void setFailedOver(boolean b) {

    }

    @Override
    public void setPreferSlaveDuringFailover(boolean b) {

    }

    @Override
    public void setStatementComment(String s) {

    }

    @Override
    public void shutdownServer() throws SQLException {

    }

    @Override
    public boolean supportsIsolationLevel() {
        return false;
    }

    @Override
    public boolean supportsQuotedIdentifiers() {
        return false;
    }

    @Override
    public boolean supportsTransactions() {
        return false;
    }

    @Override
    public boolean versionMeetsMinimum(int i, int i1, int i2) throws SQLException {
        return false;
    }

    @Override
    public void reportQueryTime(long l) {

    }

    @Override
    public boolean isAbonormallyLongQuery(long l) {
        return false;
    }

    @Override
    public String exposeAsXml() throws SQLException {
        return null;
    }

    @Override
    public boolean getAllowLoadLocalInfile() {
        return false;
    }

    @Override
    public boolean getAllowMultiQueries() {
        return false;
    }

    @Override
    public boolean getAllowNanAndInf() {
        return false;
    }

    @Override
    public boolean getAllowUrlInLocalInfile() {
        return false;
    }

    @Override
    public boolean getAlwaysSendSetIsolation() {
        return false;
    }

    @Override
    public boolean getAutoDeserialize() {
        return false;
    }

    @Override
    public boolean getAutoGenerateTestcaseScript() {
        return false;
    }

    @Override
    public boolean getAutoReconnectForPools() {
        return false;
    }

    @Override
    public int getBlobSendChunkSize() {
        return 0;
    }

    @Override
    public boolean getCacheCallableStatements() {
        return false;
    }

    @Override
    public boolean getCachePreparedStatements() {
        return false;
    }

    @Override
    public boolean getCacheResultSetMetadata() {
        return false;
    }

    @Override
    public boolean getCacheServerConfiguration() {
        return false;
    }

    @Override
    public int getCallableStatementCacheSize() {
        return 0;
    }

    @Override
    public boolean getCapitalizeTypeNames() {
        return false;
    }

    @Override
    public String getCharacterSetResults() {
        return null;
    }

    @Override
    public boolean getClobberStreamingResults() {
        return false;
    }

    @Override
    public String getClobCharacterEncoding() {
        return null;
    }

    @Override
    public String getConnectionCollation() {
        return null;
    }

    @Override
    public int getConnectTimeout() {
        return 0;
    }

    @Override
    public boolean getContinueBatchOnError() {
        return false;
    }

    @Override
    public boolean getCreateDatabaseIfNotExist() {
        return false;
    }

    @Override
    public int getDefaultFetchSize() {
        return 0;
    }

    @Override
    public boolean getDontTrackOpenResources() {
        return false;
    }

    @Override
    public boolean getDumpQueriesOnException() {
        return false;
    }

    @Override
    public boolean getDynamicCalendars() {
        return false;
    }

    @Override
    public boolean getElideSetAutoCommits() {
        return false;
    }

    @Override
    public boolean getEmptyStringsConvertToZero() {
        return false;
    }

    @Override
    public boolean getEmulateLocators() {
        return false;
    }

    @Override
    public boolean getEmulateUnsupportedPstmts() {
        return false;
    }

    @Override
    public boolean getEnablePacketDebug() {
        return false;
    }

    @Override
    public String getEncoding() {
        return null;
    }

    @Override
    public boolean getExplainSlowQueries() {
        return false;
    }

    @Override
    public boolean getFailOverReadOnly() {
        return false;
    }

    @Override
    public boolean getGatherPerformanceMetrics() {
        return false;
    }

    @Override
    public boolean getHoldResultsOpenOverStatementClose() {
        return false;
    }

    @Override
    public boolean getIgnoreNonTxTables() {
        return false;
    }

    @Override
    public int getInitialTimeout() {
        return 0;
    }

    @Override
    public boolean getInteractiveClient() {
        return false;
    }

    @Override
    public boolean getIsInteractiveClient() {
        return false;
    }

    @Override
    public boolean getJdbcCompliantTruncation() {
        return false;
    }

    @Override
    public int getLocatorFetchBufferSize() {
        return 0;
    }

    @Override
    public String getLogger() {
        return null;
    }

    @Override
    public String getLoggerClassName() {
        return null;
    }

    @Override
    public boolean getLogSlowQueries() {
        return false;
    }

    @Override
    public boolean getMaintainTimeStats() {
        return false;
    }

    @Override
    public int getMaxQuerySizeToLog() {
        return 0;
    }

    @Override
    public int getMaxReconnects() {
        return 0;
    }

    @Override
    public int getMaxRows() {
        return 0;
    }

    @Override
    public int getMetadataCacheSize() {
        return 0;
    }

    @Override
    public boolean getNoDatetimeStringSync() {
        return false;
    }

    @Override
    public boolean getNullCatalogMeansCurrent() {
        return false;
    }

    @Override
    public boolean getNullNamePatternMatchesAll() {
        return false;
    }

    @Override
    public int getPacketDebugBufferSize() {
        return 0;
    }

    @Override
    public boolean getParanoid() {
        return false;
    }

    @Override
    public boolean getPedantic() {
        return false;
    }

    @Override
    public int getPreparedStatementCacheSize() {
        return 0;
    }

    @Override
    public int getPreparedStatementCacheSqlLimit() {
        return 0;
    }

    @Override
    public boolean getProfileSql() {
        return false;
    }

    @Override
    public boolean getProfileSQL() {
        return false;
    }

    @Override
    public String getPropertiesTransform() {
        return null;
    }

    @Override
    public int getQueriesBeforeRetryMaster() {
        return 0;
    }

    @Override
    public boolean getReconnectAtTxEnd() {
        return false;
    }

    @Override
    public boolean getRelaxAutoCommit() {
        return false;
    }

    @Override
    public int getReportMetricsIntervalMillis() {
        return 0;
    }

    @Override
    public boolean getRequireSSL() {
        return false;
    }

    @Override
    public boolean getRollbackOnPooledClose() {
        return false;
    }

    @Override
    public boolean getRoundRobinLoadBalance() {
        return false;
    }

    @Override
    public boolean getRunningCTS13() {
        return false;
    }

    @Override
    public int getSecondsBeforeRetryMaster() {
        return 0;
    }

    @Override
    public String getServerTimezone() {
        return null;
    }

    @Override
    public String getSessionVariables() {
        return null;
    }

    @Override
    public int getSlowQueryThresholdMillis() {
        return 0;
    }

    @Override
    public String getSocketFactoryClassName() {
        return null;
    }

    @Override
    public int getSocketTimeout() {
        return 0;
    }

    @Override
    public boolean getStrictFloatingPoint() {
        return false;
    }

    @Override
    public boolean getStrictUpdates() {
        return false;
    }

    @Override
    public boolean getTinyInt1isBit() {
        return false;
    }

    @Override
    public boolean getTraceProtocol() {
        return false;
    }

    @Override
    public boolean getTransformedBitIsBoolean() {
        return false;
    }

    @Override
    public boolean getUseCompression() {
        return false;
    }

    @Override
    public boolean getUseFastIntParsing() {
        return false;
    }

    @Override
    public boolean getUseHostsInPrivileges() {
        return false;
    }

    @Override
    public boolean getUseInformationSchema() {
        return false;
    }

    @Override
    public boolean getUseLocalSessionState() {
        return false;
    }

    @Override
    public boolean getUseOldUTF8Behavior() {
        return false;
    }

    @Override
    public boolean getUseOnlyServerErrorMessages() {
        return false;
    }

    @Override
    public boolean getUseReadAheadInput() {
        return false;
    }

    @Override
    public boolean getUseServerPreparedStmts() {
        return false;
    }

    @Override
    public boolean getUseSqlStateCodes() {
        return false;
    }

    @Override
    public boolean getUseSSL() {
        return false;
    }

    @Override
    public boolean getUseStreamLengthsInPrepStmts() {
        return false;
    }

    @Override
    public boolean getUseTimezone() {
        return false;
    }

    @Override
    public boolean getUseUltraDevWorkAround() {
        return false;
    }

    @Override
    public boolean getUseUnbufferedInput() {
        return false;
    }

    @Override
    public boolean getUseUnicode() {
        return false;
    }

    @Override
    public boolean getUseUsageAdvisor() {
        return false;
    }

    @Override
    public boolean getYearIsDateType() {
        return false;
    }

    @Override
    public String getZeroDateTimeBehavior() {
        return null;
    }

    @Override
    public void setAllowLoadLocalInfile(boolean b) {

    }

    @Override
    public void setAllowMultiQueries(boolean b) {

    }

    @Override
    public void setAllowNanAndInf(boolean b) {

    }

    @Override
    public void setAllowUrlInLocalInfile(boolean b) {

    }

    @Override
    public void setAlwaysSendSetIsolation(boolean b) {

    }

    @Override
    public void setAutoDeserialize(boolean b) {

    }

    @Override
    public void setAutoGenerateTestcaseScript(boolean b) {

    }

    @Override
    public void setAutoReconnect(boolean b) {

    }

    @Override
    public void setAutoReconnectForConnectionPools(boolean b) {

    }

    @Override
    public void setAutoReconnectForPools(boolean b) {

    }

    @Override
    public void setBlobSendChunkSize(String s) throws SQLException {

    }

    @Override
    public void setCacheCallableStatements(boolean b) {

    }

    @Override
    public void setCachePreparedStatements(boolean b) {

    }

    @Override
    public void setCacheResultSetMetadata(boolean b) {

    }

    @Override
    public void setCacheServerConfiguration(boolean b) {

    }

    @Override
    public void setCallableStatementCacheSize(int i) {

    }

    @Override
    public void setCapitalizeDBMDTypes(boolean b) {

    }

    @Override
    public void setCapitalizeTypeNames(boolean b) {

    }

    @Override
    public void setCharacterEncoding(String s) {

    }

    @Override
    public void setCharacterSetResults(String s) {

    }

    @Override
    public void setClobberStreamingResults(boolean b) {

    }

    @Override
    public void setClobCharacterEncoding(String s) {

    }

    @Override
    public void setConnectionCollation(String s) {

    }

    @Override
    public void setConnectTimeout(int i) {

    }

    @Override
    public void setContinueBatchOnError(boolean b) {

    }

    @Override
    public void setCreateDatabaseIfNotExist(boolean b) {

    }

    @Override
    public void setDefaultFetchSize(int i) {

    }

    @Override
    public void setDetectServerPreparedStmts(boolean b) {

    }

    @Override
    public void setDontTrackOpenResources(boolean b) {

    }

    @Override
    public void setDumpQueriesOnException(boolean b) {

    }

    @Override
    public void setDynamicCalendars(boolean b) {

    }

    @Override
    public void setElideSetAutoCommits(boolean b) {

    }

    @Override
    public void setEmptyStringsConvertToZero(boolean b) {

    }

    @Override
    public void setEmulateLocators(boolean b) {

    }

    @Override
    public void setEmulateUnsupportedPstmts(boolean b) {

    }

    @Override
    public void setEnablePacketDebug(boolean b) {

    }

    @Override
    public void setEncoding(String s) {

    }

    @Override
    public void setExplainSlowQueries(boolean b) {

    }

    @Override
    public void setFailOverReadOnly(boolean b) {

    }

    @Override
    public void setGatherPerformanceMetrics(boolean b) {

    }

    @Override
    public void setHoldResultsOpenOverStatementClose(boolean b) {

    }

    @Override
    public void setIgnoreNonTxTables(boolean b) {

    }

    @Override
    public void setInitialTimeout(int i) {

    }

    @Override
    public void setIsInteractiveClient(boolean b) {

    }

    @Override
    public void setJdbcCompliantTruncation(boolean b) {

    }

    @Override
    public void setLocatorFetchBufferSize(String s) throws SQLException {

    }

    @Override
    public void setLogger(String s) {

    }

    @Override
    public void setLoggerClassName(String s) {

    }

    @Override
    public void setLogSlowQueries(boolean b) {

    }

    @Override
    public void setMaintainTimeStats(boolean b) {

    }

    @Override
    public void setMaxQuerySizeToLog(int i) {

    }

    @Override
    public void setMaxReconnects(int i) {

    }

    @Override
    public void setMaxRows(int i) {

    }

    @Override
    public void setMetadataCacheSize(int i) {

    }

    @Override
    public void setNoDatetimeStringSync(boolean b) {

    }

    @Override
    public void setNullCatalogMeansCurrent(boolean b) {

    }

    @Override
    public void setNullNamePatternMatchesAll(boolean b) {

    }

    @Override
    public void setPacketDebugBufferSize(int i) {

    }

    @Override
    public void setParanoid(boolean b) {

    }

    @Override
    public void setPedantic(boolean b) {

    }

    @Override
    public void setPreparedStatementCacheSize(int i) {

    }

    @Override
    public void setPreparedStatementCacheSqlLimit(int i) {

    }

    @Override
    public void setProfileSql(boolean b) {

    }

    @Override
    public void setProfileSQL(boolean b) {

    }

    @Override
    public void setPropertiesTransform(String s) {

    }

    @Override
    public void setQueriesBeforeRetryMaster(int i) {

    }

    @Override
    public void setReconnectAtTxEnd(boolean b) {

    }

    @Override
    public void setRelaxAutoCommit(boolean b) {

    }

    @Override
    public void setReportMetricsIntervalMillis(int i) {

    }

    @Override
    public void setRequireSSL(boolean b) {

    }

    @Override
    public void setRetainStatementAfterResultSetClose(boolean b) {

    }

    @Override
    public void setRollbackOnPooledClose(boolean b) {

    }

    @Override
    public void setRoundRobinLoadBalance(boolean b) {

    }

    @Override
    public void setRunningCTS13(boolean b) {

    }

    @Override
    public void setSecondsBeforeRetryMaster(int i) {

    }

    @Override
    public void setServerTimezone(String s) {

    }

    @Override
    public void setSessionVariables(String s) {

    }

    @Override
    public void setSlowQueryThresholdMillis(int i) {

    }

    @Override
    public void setSocketFactoryClassName(String s) {

    }

    @Override
    public void setSocketTimeout(int i) {

    }

    @Override
    public void setStrictFloatingPoint(boolean b) {

    }

    @Override
    public void setStrictUpdates(boolean b) {

    }

    @Override
    public void setTinyInt1isBit(boolean b) {

    }

    @Override
    public void setTraceProtocol(boolean b) {

    }

    @Override
    public void setTransformedBitIsBoolean(boolean b) {

    }

    @Override
    public void setUseCompression(boolean b) {

    }

    @Override
    public void setUseFastIntParsing(boolean b) {

    }

    @Override
    public void setUseHostsInPrivileges(boolean b) {

    }

    @Override
    public void setUseInformationSchema(boolean b) {

    }

    @Override
    public void setUseLocalSessionState(boolean b) {

    }

    @Override
    public void setUseOldUTF8Behavior(boolean b) {

    }

    @Override
    public void setUseOnlyServerErrorMessages(boolean b) {

    }

    @Override
    public void setUseReadAheadInput(boolean b) {

    }

    @Override
    public void setUseServerPreparedStmts(boolean b) {

    }

    @Override
    public void setUseSqlStateCodes(boolean b) {

    }

    @Override
    public void setUseSSL(boolean b) {

    }

    @Override
    public void setUseStreamLengthsInPrepStmts(boolean b) {

    }

    @Override
    public void setUseTimezone(boolean b) {

    }

    @Override
    public void setUseUltraDevWorkAround(boolean b) {

    }

    @Override
    public void setUseUnbufferedInput(boolean b) {

    }

    @Override
    public void setUseUnicode(boolean b) {

    }

    @Override
    public void setUseUsageAdvisor(boolean b) {

    }

    @Override
    public void setYearIsDateType(boolean b) {

    }

    @Override
    public void setZeroDateTimeBehavior(String s) {

    }

    @Override
    public boolean useUnbufferedInput() {
        return false;
    }

    @Override
    public boolean getUseCursorFetch() {
        return false;
    }

    @Override
    public void setUseCursorFetch(boolean b) {

    }

    @Override
    public boolean getOverrideSupportsIntegrityEnhancementFacility() {
        return false;
    }

    @Override
    public void setOverrideSupportsIntegrityEnhancementFacility(boolean b) {

    }

    @Override
    public boolean getNoTimezoneConversionForTimeType() {
        return false;
    }

    @Override
    public void setNoTimezoneConversionForTimeType(boolean b) {

    }

    @Override
    public boolean getUseJDBCCompliantTimezoneShift() {
        return false;
    }

    @Override
    public void setUseJDBCCompliantTimezoneShift(boolean b) {

    }

    @Override
    public boolean getAutoClosePStmtStreams() {
        return false;
    }

    @Override
    public void setAutoClosePStmtStreams(boolean b) {

    }

    @Override
    public boolean getProcessEscapeCodesForPrepStmts() {
        return false;
    }

    @Override
    public void setProcessEscapeCodesForPrepStmts(boolean b) {

    }

    @Override
    public boolean getUseGmtMillisForDatetimes() {
        return false;
    }

    @Override
    public void setUseGmtMillisForDatetimes(boolean b) {

    }

    @Override
    public boolean getDumpMetadataOnColumnNotFound() {
        return false;
    }

    @Override
    public void setDumpMetadataOnColumnNotFound(boolean b) {

    }

    @Override
    public String getResourceId() {
        return null;
    }

    @Override
    public void setResourceId(String s) {

    }

    @Override
    public boolean getRewriteBatchedStatements() {
        return false;
    }

    @Override
    public void setRewriteBatchedStatements(boolean b) {

    }

    @Override
    public boolean getJdbcCompliantTruncationForReads() {
        return false;
    }

    @Override
    public void setJdbcCompliantTruncationForReads(boolean b) {

    }

    @Override
    public boolean getUseJvmCharsetConverters() {
        return false;
    }

    @Override
    public void setUseJvmCharsetConverters(boolean b) {

    }

    @Override
    public boolean getPinGlobalTxToPhysicalConnection() {
        return false;
    }

    @Override
    public void setPinGlobalTxToPhysicalConnection(boolean b) {

    }

    @Override
    public void setGatherPerfMetrics(boolean b) {

    }

    @Override
    public boolean getGatherPerfMetrics() {
        return false;
    }

    @Override
    public void setUltraDevHack(boolean b) {

    }

    @Override
    public boolean getUltraDevHack() {
        return false;
    }

    @Override
    public void setInteractiveClient(boolean b) {

    }

    @Override
    public void setSocketFactory(String s) {

    }

    @Override
    public String getSocketFactory() {
        return null;
    }

    @Override
    public void setUseServerPrepStmts(boolean b) {

    }

    @Override
    public boolean getUseServerPrepStmts() {
        return false;
    }

    @Override
    public void setCacheCallableStmts(boolean b) {

    }

    @Override
    public boolean getCacheCallableStmts() {
        return false;
    }

    @Override
    public void setCachePrepStmts(boolean b) {

    }

    @Override
    public boolean getCachePrepStmts() {
        return false;
    }

    @Override
    public void setCallableStmtCacheSize(int i) {

    }

    @Override
    public int getCallableStmtCacheSize() {
        return 0;
    }

    @Override
    public void setPrepStmtCacheSize(int i) {

    }

    @Override
    public int getPrepStmtCacheSize() {
        return 0;
    }

    @Override
    public void setPrepStmtCacheSqlLimit(int i) {

    }

    @Override
    public int getPrepStmtCacheSqlLimit() {
        return 0;
    }

    @Override
    public boolean getNoAccessToProcedureBodies() {
        return false;
    }

    @Override
    public void setNoAccessToProcedureBodies(boolean b) {

    }

    @Override
    public boolean getUseOldAliasMetadataBehavior() {
        return false;
    }

    @Override
    public void setUseOldAliasMetadataBehavior(boolean b) {

    }

    @Override
    public String getClientCertificateKeyStorePassword() {
        return null;
    }

    @Override
    public void setClientCertificateKeyStorePassword(String s) {

    }

    @Override
    public String getClientCertificateKeyStoreType() {
        return null;
    }

    @Override
    public void setClientCertificateKeyStoreType(String s) {

    }

    @Override
    public String getClientCertificateKeyStoreUrl() {
        return null;
    }

    @Override
    public void setClientCertificateKeyStoreUrl(String s) {

    }

    @Override
    public String getTrustCertificateKeyStorePassword() {
        return null;
    }

    @Override
    public void setTrustCertificateKeyStorePassword(String s) {

    }

    @Override
    public String getTrustCertificateKeyStoreType() {
        return null;
    }

    @Override
    public void setTrustCertificateKeyStoreType(String s) {

    }

    @Override
    public String getTrustCertificateKeyStoreUrl() {
        return null;
    }

    @Override
    public void setTrustCertificateKeyStoreUrl(String s) {

    }

    @Override
    public boolean getUseSSPSCompatibleTimezoneShift() {
        return false;
    }

    @Override
    public void setUseSSPSCompatibleTimezoneShift(boolean b) {

    }

    @Override
    public boolean getTreatUtilDateAsTimestamp() {
        return false;
    }

    @Override
    public void setTreatUtilDateAsTimestamp(boolean b) {

    }

    @Override
    public boolean getUseFastDateParsing() {
        return false;
    }

    @Override
    public void setUseFastDateParsing(boolean b) {

    }

    @Override
    public String getLocalSocketAddress() {
        return null;
    }

    @Override
    public void setLocalSocketAddress(String s) {

    }

    @Override
    public void setUseConfigs(String s) {

    }

    @Override
    public String getUseConfigs() {
        return null;
    }

    @Override
    public boolean getGenerateSimpleParameterMetadata() {
        return false;
    }

    @Override
    public void setGenerateSimpleParameterMetadata(boolean b) {

    }

    @Override
    public boolean getLogXaCommands() {
        return false;
    }

    @Override
    public void setLogXaCommands(boolean b) {

    }

    @Override
    public int getResultSetSizeThreshold() {
        return 0;
    }

    @Override
    public void setResultSetSizeThreshold(int i) {

    }

    @Override
    public int getNetTimeoutForStreamingResults() {
        return 0;
    }

    @Override
    public void setNetTimeoutForStreamingResults(int i) {

    }

    @Override
    public boolean getEnableQueryTimeouts() {
        return false;
    }

    @Override
    public void setEnableQueryTimeouts(boolean b) {

    }

    @Override
    public boolean getPadCharsWithSpace() {
        return false;
    }

    @Override
    public void setPadCharsWithSpace(boolean b) {

    }

    @Override
    public boolean getUseDynamicCharsetInfo() {
        return false;
    }

    @Override
    public void setUseDynamicCharsetInfo(boolean b) {

    }

    @Override
    public String getClientInfoProvider() {
        return null;
    }

    @Override
    public void setClientInfoProvider(String s) {

    }

    @Override
    public boolean getPopulateInsertRowWithDefaultValues() {
        return false;
    }

    @Override
    public void setPopulateInsertRowWithDefaultValues(boolean b) {

    }

    @Override
    public String getLoadBalanceStrategy() {
        return null;
    }

    @Override
    public void setLoadBalanceStrategy(String s) {

    }

    @Override
    public boolean getTcpNoDelay() {
        return false;
    }

    @Override
    public void setTcpNoDelay(boolean b) {

    }

    @Override
    public boolean getTcpKeepAlive() {
        return false;
    }

    @Override
    public void setTcpKeepAlive(boolean b) {

    }

    @Override
    public int getTcpRcvBuf() {
        return 0;
    }

    @Override
    public void setTcpRcvBuf(int i) {

    }

    @Override
    public int getTcpSndBuf() {
        return 0;
    }

    @Override
    public void setTcpSndBuf(int i) {

    }

    @Override
    public int getTcpTrafficClass() {
        return 0;
    }

    @Override
    public void setTcpTrafficClass(int i) {

    }

    @Override
    public boolean getUseNanosForElapsedTime() {
        return false;
    }

    @Override
    public void setUseNanosForElapsedTime(boolean b) {

    }

    @Override
    public long getSlowQueryThresholdNanos() {
        return 0;
    }

    @Override
    public void setSlowQueryThresholdNanos(long l) {

    }

    @Override
    public String getStatementInterceptors() {
        return null;
    }

    @Override
    public void setStatementInterceptors(String s) {

    }

    @Override
    public boolean getUseDirectRowUnpack() {
        return false;
    }

    @Override
    public void setUseDirectRowUnpack(boolean b) {

    }

    @Override
    public String getLargeRowSizeThreshold() {
        return null;
    }

    @Override
    public void setLargeRowSizeThreshold(String s) {

    }

    @Override
    public boolean getUseBlobToStoreUTF8OutsideBMP() {
        return false;
    }

    @Override
    public void setUseBlobToStoreUTF8OutsideBMP(boolean b) {

    }

    @Override
    public String getUtf8OutsideBmpExcludedColumnNamePattern() {
        return null;
    }

    @Override
    public void setUtf8OutsideBmpExcludedColumnNamePattern(String s) {

    }

    @Override
    public String getUtf8OutsideBmpIncludedColumnNamePattern() {
        return null;
    }

    @Override
    public void setUtf8OutsideBmpIncludedColumnNamePattern(String s) {

    }

    @Override
    public boolean getIncludeInnodbStatusInDeadlockExceptions() {
        return false;
    }

    @Override
    public void setIncludeInnodbStatusInDeadlockExceptions(boolean b) {

    }

    @Override
    public boolean getBlobsAreStrings() {
        return false;
    }

    @Override
    public void setBlobsAreStrings(boolean b) {

    }

    @Override
    public boolean getFunctionsNeverReturnBlobs() {
        return false;
    }

    @Override
    public void setFunctionsNeverReturnBlobs(boolean b) {

    }

    @Override
    public boolean getAutoSlowLog() {
        return false;
    }

    @Override
    public void setAutoSlowLog(boolean b) {

    }

    @Override
    public String getConnectionLifecycleInterceptors() {
        return null;
    }

    @Override
    public void setConnectionLifecycleInterceptors(String s) {

    }

    @Override
    public Statement createStatement() throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return null;
    }

    @Override
    public CallableStatement prepareCall(String sql) throws SQLException {
        return null;
    }

    @Override
    public String nativeSQL(String sql) throws SQLException {
        return null;
    }

    @Override
    public void setAutoCommit(boolean autoCommit) throws SQLException {

    }

    @Override
    public boolean getAutoCommit() throws SQLException {
        return false;
    }

    @Override
    public void commit() throws SQLException {

    }

    @Override
    public void rollback() throws SQLException {

    }

    @Override
    public void close() throws SQLException {

    }

    @Override
    public boolean isClosed() throws SQLException {
        return false;
    }

    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        return null;
    }

    @Override
    public void setReadOnly(boolean readOnly) throws SQLException {

    }

    @Override
    public boolean isReadOnly() throws SQLException {
        return false;
    }

    @Override
    public void setCatalog(String catalog) throws SQLException {

    }

    @Override
    public String getCatalog() throws SQLException {
        return null;
    }

    @Override
    public void setTransactionIsolation(int level) throws SQLException {

    }

    @Override
    public int getTransactionIsolation() throws SQLException {
        return 0;
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }

    @Override
    public void clearWarnings() throws SQLException {

    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return null;
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return null;
    }

    @Override
    public Map<String, Class<?>> getTypeMap() throws SQLException {
        return null;
    }

    @Override
    public void setTypeMap(Map<String, Class<?>> map) throws SQLException {

    }

    @Override
    public void setHoldability(int holdability) throws SQLException {

    }

    @Override
    public int getHoldability() throws SQLException {
        return 0;
    }

    @Override
    public Savepoint setSavepoint() throws SQLException {
        return null;
    }

    @Override
    public Savepoint setSavepoint(String name) throws SQLException {
        return null;
    }

    @Override
    public void rollback(Savepoint savepoint) throws SQLException {

    }

    @Override
    public void releaseSavepoint(Savepoint savepoint) throws SQLException {

    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return null;
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        return null;
    }

    @Override
    public Clob createClob() throws SQLException {
        return null;
    }

    @Override
    public Blob createBlob() throws SQLException {
        return null;
    }

    @Override
    public NClob createNClob() throws SQLException {
        return null;
    }

    @Override
    public SQLXML createSQLXML() throws SQLException {
        return null;
    }

    @Override
    public boolean isValid(int timeout) throws SQLException {
        return false;
    }

    @Override
    public void setClientInfo(String name, String value) throws SQLClientInfoException {

    }

    @Override
    public void setClientInfo(Properties properties) throws SQLClientInfoException {

    }

    @Override
    public String getClientInfo(String name) throws SQLException {
        return null;
    }

    @Override
    public Properties getClientInfo() throws SQLException {
        return null;
    }

    @Override
    public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
        return null;
    }

    @Override
    public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
        return null;
    }

    @Override
    public void setSchema(String schema) throws SQLException {

    }

    @Override
    public String getSchema() throws SQLException {
        return null;
    }

    @Override
    public void abort(Executor executor) throws SQLException {

    }

    @Override
    public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {

    }

    @Override
    public int getNetworkTimeout() throws SQLException {
        return 0;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }

    // 接口实现忽略.....
}