package com.test.event.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Headers {

    @JsonProperty("x-forwarded-for")
    private String xForwardedFor;
    @JsonProperty("sec-ch-ua-mobile")
    private String secChUaMobile;
    @JsonProperty("cloudfront-viewer-country")
    private String cloudfrontViewerCountry;
    @JsonProperty("cloudfront-is-tablet-viewer")
    private String cloudfrontIsTabletViewer;
    @JsonProperty("x-amzn-requestid")
    private String xAmznRequestid;
    @JsonProperty("via")
    private String via;
    @JsonProperty("cloudfront-forwarded-proto")
    private String cloudfrontForwardedProto;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("content-length")
    private String contentLength;
    @JsonProperty("x-forwarded-proto")
    private String xForwardedProto;
    @JsonProperty("accept-language")
    private String acceptLanguage;
    @JsonProperty("host")
    private String host;
    @JsonProperty("user-agent")
    private String userAgent;
    @JsonProperty("cloudfront-is-mobile-viewer")
    private String cloudfrontIsMobileViewer;
    @JsonProperty("accept")
    private String accept;
    @JsonProperty("priority")
    private String priority;
    @JsonProperty("cloudfront-viewer-asn")
    private String cloudfrontViewerAsn;
    @JsonProperty("cloudfront-is-smarttv-viewer")
    private String cloudfrontIsSmarttvViewer;
    @JsonProperty("x-amzn-appsync-is-vpce-request")
    private String xAmznAppsyncIsVpceRequest;
    @JsonProperty("accept-encoding")
    private String acceptEncoding;
    @JsonProperty("referer")
    private String referer;
    @JsonProperty("x-amzn-remote-ip")
    private String xAmznRemoteIp;
    @JsonProperty("x-api-key")
    private String xApiKey;
    @JsonProperty("content-type")
    private String contentType;
    @JsonProperty("sec-fetch-mode")
    private String secFetchMode;
    @JsonProperty("x-amzn-trace-id")
    private String xAmznTraceId;
    @JsonProperty("x-amz-cf-id")
    private String xAmzCfId;
    @JsonProperty("sec-fetch-dest")
    private String secFetchDest;
    @JsonProperty("x-amz-user-agent")
    private String xAmzUserAgent;
    @JsonProperty("sec-ch-ua-platform")
    private String secChUaPlatform;
    @JsonProperty("cloudfront-is-desktop-viewer")
    private String cloudfrontIsDesktopViewer;
    @JsonProperty("sec-fetch-site")
    private String secFetchSite;
    @JsonProperty("sec-ch-ua")
    private String secChUa;
    @JsonProperty("x-forwarded-port")
    private String xForwardedPort;

    @JsonProperty("x-forwarded-for")
    public String getxForwardedFor() {
        return xForwardedFor;
    }

    @JsonProperty("x-forwarded-for")
    public void setxForwardedFor(String xForwardedFor) {
        this.xForwardedFor = xForwardedFor;
    }

    @JsonProperty("sec-ch-ua-mobile")
    public String getSecChUaMobile() {
        return secChUaMobile;
    }

    @JsonProperty("sec-ch-ua-mobile")
    public void setSecChUaMobile(String secChUaMobile) {
        this.secChUaMobile = secChUaMobile;
    }

    @JsonProperty("cloudfront-viewer-country")
    public String getCloudfrontViewerCountry() {
        return cloudfrontViewerCountry;
    }

    @JsonProperty("cloudfront-viewer-country")
    public void setCloudfrontViewerCountry(String cloudfrontViewerCountry) {
        this.cloudfrontViewerCountry = cloudfrontViewerCountry;
    }

    @JsonProperty("cloudfront-is-tablet-viewer")
    public String getCloudfrontIsTabletViewer() {
        return cloudfrontIsTabletViewer;
    }

    @JsonProperty("cloudfront-is-tablet-viewer")
    public void setCloudfrontIsTabletViewer(String cloudfrontIsTabletViewer) {
        this.cloudfrontIsTabletViewer = cloudfrontIsTabletViewer;
    }

    @JsonProperty("x-amzn-requestid")
    public String getxAmznRequestid() {
        return xAmznRequestid;
    }

    @JsonProperty("x-amzn-requestid")
    public void setxAmznRequestid(String xAmznRequestid) {
        this.xAmznRequestid = xAmznRequestid;
    }

    @JsonProperty("via")
    public String getVia() {
        return via;
    }

    @JsonProperty("via")
    public void setVia(String via) {
        this.via = via;
    }

    @JsonProperty("cloudfront-forwarded-proto")
    public String getCloudfrontForwardedProto() {
        return cloudfrontForwardedProto;
    }

    @JsonProperty("cloudfront-forwarded-proto")
    public void setCloudfrontForwardedProto(String cloudfrontForwardedProto) {
        this.cloudfrontForwardedProto = cloudfrontForwardedProto;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("content-length")
    public String getContentLength() {
        return contentLength;
    }

    @JsonProperty("content-length")
    public void setContentLength(String contentLength) {
        this.contentLength = contentLength;
    }

    @JsonProperty("x-forwarded-proto")
    public String getxForwardedProto() {
        return xForwardedProto;
    }

    @JsonProperty("x-forwarded-proto")
    public void setxForwardedProto(String xForwardedProto) {
        this.xForwardedProto = xForwardedProto;
    }

    @JsonProperty("accept-language")
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    @JsonProperty("accept-language")
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    @JsonProperty("host")
    public String getHost() {
        return host;
    }

    @JsonProperty("host")
    public void setHost(String host) {
        this.host = host;
    }

    @JsonProperty("user-agent")
    public String getUserAgent() {
        return userAgent;
    }

    @JsonProperty("user-agent")
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @JsonProperty("cloudfront-is-mobile-viewer")
    public String getCloudfrontIsMobileViewer() {
        return cloudfrontIsMobileViewer;
    }

    @JsonProperty("cloudfront-is-mobile-viewer")
    public void setCloudfrontIsMobileViewer(String cloudfrontIsMobileViewer) {
        this.cloudfrontIsMobileViewer = cloudfrontIsMobileViewer;
    }

    @JsonProperty("accept")
    public String getAccept() {
        return accept;
    }

    @JsonProperty("accept")
    public void setAccept(String accept) {
        this.accept = accept;
    }

    @JsonProperty("priority")
    public String getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @JsonProperty("cloudfront-viewer-asn")
    public String getCloudfrontViewerAsn() {
        return cloudfrontViewerAsn;
    }

    @JsonProperty("cloudfront-viewer-asn")
    public void setCloudfrontViewerAsn(String cloudfrontViewerAsn) {
        this.cloudfrontViewerAsn = cloudfrontViewerAsn;
    }

    @JsonProperty("cloudfront-is-smarttv-viewer")
    public String getCloudfrontIsSmarttvViewer() {
        return cloudfrontIsSmarttvViewer;
    }

    @JsonProperty("cloudfront-is-smarttv-viewer")
    public void setCloudfrontIsSmarttvViewer(String cloudfrontIsSmarttvViewer) {
        this.cloudfrontIsSmarttvViewer = cloudfrontIsSmarttvViewer;
    }

    @JsonProperty("x-amzn-appsync-is-vpce-request")
    public String getxAmznAppsyncIsVpceRequest() {
        return xAmznAppsyncIsVpceRequest;
    }

    @JsonProperty("x-amzn-appsync-is-vpce-request")
    public void setxAmznAppsyncIsVpceRequest(String xAmznAppsyncIsVpceRequest) {
        this.xAmznAppsyncIsVpceRequest = xAmznAppsyncIsVpceRequest;
    }

    @JsonProperty("accept-encoding")
    public String getAcceptEncoding() {
        return acceptEncoding;
    }

    @JsonProperty("accept-encoding")
    public void setAcceptEncoding(String acceptEncoding) {
        this.acceptEncoding = acceptEncoding;
    }

    @JsonProperty("referer")
    public String getReferer() {
        return referer;
    }

    @JsonProperty("referer")
    public void setReferer(String referer) {
        this.referer = referer;
    }

    @JsonProperty("x-amzn-remote-ip")
    public String getxAmznRemoteIp() {
        return xAmznRemoteIp;
    }

    @JsonProperty("x-amzn-remote-ip")
    public void setxAmznRemoteIp(String xAmznRemoteIp) {
        this.xAmznRemoteIp = xAmznRemoteIp;
    }

    @JsonProperty("x-api-key")
    public String getxApiKey() {
        return xApiKey;
    }

    @JsonProperty("x-api-key")
    public void setxApiKey(String xApiKey) {
        this.xApiKey = xApiKey;
    }

    @JsonProperty("content-type")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("content-type")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @JsonProperty("sec-fetch-mode")
    public String getSecFetchMode() {
        return secFetchMode;
    }

    @JsonProperty("sec-fetch-mode")
    public void setSecFetchMode(String secFetchMode) {
        this.secFetchMode = secFetchMode;
    }

    @JsonProperty("x-amzn-trace-id")
    public String getxAmznTraceId() {
        return xAmznTraceId;
    }

    @JsonProperty("x-amzn-trace-id")
    public void setxAmznTraceId(String xAmznTraceId) {
        this.xAmznTraceId = xAmznTraceId;
    }

    @JsonProperty("x-amz-cf-id")
    public String getxAmzCfId() {
        return xAmzCfId;
    }

    @JsonProperty("x-amz-cf-id")
    public void setxAmzCfId(String xAmzCfId) {
        this.xAmzCfId = xAmzCfId;
    }

    @JsonProperty("sec-fetch-dest")
    public String getSecFetchDest() {
        return secFetchDest;
    }

    @JsonProperty("sec-fetch-dest")
    public void setSecFetchDest(String secFetchDest) {
        this.secFetchDest = secFetchDest;
    }

    @JsonProperty("x-amz-user-agent")
    public String getxAmzUserAgent() {
        return xAmzUserAgent;
    }

    @JsonProperty("x-amz-user-agent")
    public void setxAmzUserAgent(String xAmzUserAgent) {
        this.xAmzUserAgent = xAmzUserAgent;
    }

    @JsonProperty("sec-ch-ua-platform")
    public String getSecChUaPlatform() {
        return secChUaPlatform;
    }

    @JsonProperty("sec-ch-ua-platform")
    public void setSecChUaPlatform(String secChUaPlatform) {
        this.secChUaPlatform = secChUaPlatform;
    }

    @JsonProperty("cloudfront-is-desktop-viewer")
    public String getCloudfrontIsDesktopViewer() {
        return cloudfrontIsDesktopViewer;
    }

    @JsonProperty("cloudfront-is-desktop-viewer")
    public void setCloudfrontIsDesktopViewer(String cloudfrontIsDesktopViewer) {
        this.cloudfrontIsDesktopViewer = cloudfrontIsDesktopViewer;
    }

    @JsonProperty("sec-fetch-site")
    public String getSecFetchSite() {
        return secFetchSite;
    }

    @JsonProperty("sec-fetch-site")
    public void setSecFetchSite(String secFetchSite) {
        this.secFetchSite = secFetchSite;
    }

    @JsonProperty("sec-ch-ua")
    public String getSecChUa() {
        return secChUa;
    }

    @JsonProperty("sec-ch-ua")
    public void setSecChUa(String secChUa) {
        this.secChUa = secChUa;
    }

    @JsonProperty("x-forwarded-port")
    public String getxForwardedPort() {
        return xForwardedPort;
    }

    @JsonProperty("x-forwarded-port")
    public void setxForwardedPort(String xForwardedPort) {
        this.xForwardedPort = xForwardedPort;
    }

}