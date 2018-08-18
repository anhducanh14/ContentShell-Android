
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     services/network/public/mojom/network_context.mojom
//

package org.chromium.network.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public interface NetworkContext extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends NetworkContext, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NetworkContext, NetworkContext.Proxy> MANAGER = NetworkContext_Internal.MANAGER;


    void createUrlLoaderFactory(
org.chromium.mojo.bindings.InterfaceRequest<UrlLoaderFactory> urlLoaderFactory, UrlLoaderFactoryParams params);



    void getCookieManager(
org.chromium.mojo.bindings.InterfaceRequest<CookieManager> cookieManager);



    void getRestrictedCookieManager(
org.chromium.mojo.bindings.InterfaceRequest<RestrictedCookieManager> restrictedCookieManager, org.chromium.url.mojom.Origin origin);



    void clearNetworkingHistorySince(
org.chromium.mojo_base.mojom.Time startTime, 
ClearNetworkingHistorySinceResponse callback);

    interface ClearNetworkingHistorySinceResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void clearHttpCache(
org.chromium.mojo_base.mojom.Time startTime, org.chromium.mojo_base.mojom.Time endTime, ClearDataFilter filter, 
ClearHttpCacheResponse callback);

    interface ClearHttpCacheResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void computeHttpCacheSize(
org.chromium.mojo_base.mojom.Time startTime, org.chromium.mojo_base.mojom.Time endTime, 
ComputeHttpCacheSizeResponse callback);

    interface ComputeHttpCacheSizeResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Boolean, Long> { }



    void clearChannelIds(
org.chromium.mojo_base.mojom.Time startTime, org.chromium.mojo_base.mojom.Time endTime, ClearDataFilter filter, 
ClearChannelIdsResponse callback);

    interface ClearChannelIdsResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void clearHostCache(
ClearDataFilter filter, 
ClearHostCacheResponse callback);

    interface ClearHostCacheResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void clearHttpAuthCache(
org.chromium.mojo_base.mojom.Time startTime, 
ClearHttpAuthCacheResponse callback);

    interface ClearHttpAuthCacheResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void clearReportingCacheReports(
ClearDataFilter filter, 
ClearReportingCacheReportsResponse callback);

    interface ClearReportingCacheReportsResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void clearReportingCacheClients(
ClearDataFilter filter, 
ClearReportingCacheClientsResponse callback);

    interface ClearReportingCacheClientsResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void clearNetworkErrorLogging(
ClearDataFilter filter, 
ClearNetworkErrorLoggingResponse callback);

    interface ClearNetworkErrorLoggingResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void closeAllConnections(

CloseAllConnectionsResponse callback);

    interface CloseAllConnectionsResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void setNetworkConditions(
org.chromium.mojo_base.mojom.UnguessableToken throttlingProfileId, NetworkConditions conditions);



    void setAcceptLanguage(
String newAcceptLanguage);



    void setEnableReferrers(
boolean enableReferrers);



    void setCtPolicy(
String[] requiredHosts, String[] excludedHosts, String[] excludedSpkis, String[] excludedLegacySpkis);



    void createUdpSocket(
org.chromium.mojo.bindings.InterfaceRequest<UdpSocket> request, UdpSocketReceiver receiver);



    void createTcpServerSocket(
org.chromium.net.interfaces.IpEndPoint localAddr, int backlog, MutableNetworkTrafficAnnotationTag trafficAnnotation, org.chromium.mojo.bindings.InterfaceRequest<TcpServerSocket> socket, 
CreateTcpServerSocketResponse callback);

    interface CreateTcpServerSocketResponse extends org.chromium.mojo.bindings.Callbacks.Callback2<Integer, org.chromium.net.interfaces.IpEndPoint> { }



    void createTcpConnectedSocket(
org.chromium.net.interfaces.IpEndPoint localAddr, org.chromium.net.interfaces.AddressList remoteAddrList, MutableNetworkTrafficAnnotationTag trafficAnnotation, org.chromium.mojo.bindings.InterfaceRequest<TcpConnectedSocket> socket, SocketObserver observer, 
CreateTcpConnectedSocketResponse callback);

    interface CreateTcpConnectedSocketResponse extends org.chromium.mojo.bindings.Callbacks.Callback5<Integer, org.chromium.net.interfaces.IpEndPoint, org.chromium.net.interfaces.IpEndPoint, org.chromium.mojo.system.DataPipe.ConsumerHandle, org.chromium.mojo.system.DataPipe.ProducerHandle> { }



    void createProxyResolvingSocketFactory(
org.chromium.mojo.bindings.InterfaceRequest<ProxyResolvingSocketFactory> factory);



    void createWebSocket(
org.chromium.mojo.bindings.InterfaceRequest<WebSocket> request, int processId, int renderFrameId, org.chromium.url.mojom.Origin origin, AuthenticationHandler authHandler);



    void lookUpProxyForUrl(
org.chromium.url.mojom.Url url, ProxyLookupClient proxyLookupClient);



    void createNetLogExporter(
org.chromium.mojo.bindings.InterfaceRequest<NetLogExporter> exporter);



    void preconnectSockets(
int numStreams, org.chromium.url.mojom.Url url, int loadFlags, boolean privacyModeEnabled);



    void createP2pSocketManager(
P2pTrustedSocketManagerClient client, org.chromium.mojo.bindings.InterfaceRequest<P2pTrustedSocketManager> trustedSocketManager, org.chromium.mojo.bindings.InterfaceRequest<P2pSocketManager> socketManager);



    void resetUrlLoaderFactories(
);



    void resolveHost(
HostPortPair host, org.chromium.mojo.bindings.InterfaceRequest<ResolveHostHandle> controlHandle, ResolveHostClient responseClient);



    void addHstsForTesting(
String host, org.chromium.mojo_base.mojom.Time expiry, boolean includeSubdomains, 
AddHstsForTestingResponse callback);

    interface AddHstsForTestingResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }



    void setFailingHttpTransactionForTesting(
int rv, 
SetFailingHttpTransactionForTestingResponse callback);

    interface SetFailingHttpTransactionForTestingResponse extends org.chromium.mojo.bindings.Callbacks.Callback0 { }


}