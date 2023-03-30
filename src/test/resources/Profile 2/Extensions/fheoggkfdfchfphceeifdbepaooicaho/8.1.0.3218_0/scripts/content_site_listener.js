/*!
 * 
 *     MCAFEE RESTRICTED CONFIDENTIAL
 *     Copyright (c) 2023 McAfee, LLC
 *
 *     The source code contained or described herein and all documents related
 *     to the source code ("Material") are owned by McAfee or its
 *     suppliers or licensors. Title to the Material remains with McAfee
 *     or its suppliers and licensors. The Material contains trade
 *     secrets and proprietary and confidential information of McAfee or its
 *     suppliers and licensors. The Material is protected by worldwide copyright
 *     and trade secret laws and treaty provisions. No part of the Material may
 *     be used, copied, reproduced, modified, published, uploaded, posted,
 *     transmitted, distributed, or disclosed in any way without McAfee's prior
 *     express written permission.
 *
 *     No license under any patent, copyright, trade secret or other intellectual
 *     property right is granted to or conferred upon you by disclosure or
 *     delivery of the Materials, either expressly, by implication, inducement,
 *     estoppel or otherwise. Any license under such intellectual property rights
 *     must be expressed and approved by McAfee in writing.
 *
 */(()=>{"use strict";const e="LOCAL_STORE",s="CONTENT_HANDLER",t="EXECUTE_COMMAND",n="FOCUS_OR_CREATE_TAB",a="GET_BK_GLOBALS",o="GET_EXTENSION_STATUS",c="GET_TAB_DATA",m="TI_REQUEST",i="PLACEHOLDER_TEXT",r="REMOVE_TAB",d="SEND_TELEMETRY",T="SET_VIEWPORT",E="WHITELIST",_="RESET_NATIVE_SETTING",g="UPDATE_BK_NATIVE_SETTINGS",u="SHOW_SIDEBAR_MAIN",S="GET_POPUP_DATA",l="GET_SETTINGS_DATA",M="RESET_SETTINGS",A="GET_TYPOSQUATTING_DATA",I="IS_FRAME_BLOCKED",h="IS_WHITELISTED",P="ANY_BLOCKED_IFRAMES",O="ANY_BLOCKED_CRYPTOSCRIPTS",D="UNBLOCK_ALL_IFRAMES",N="VIEW_SITE_REPORT",C="SEARCH_ANNOTATION",L="UPDATE_ENGINE_STATS",R="SOCIAL_MEDIA_ANNOTATION",F="UPDATE_RAT_DETECTION_SHOWING_FLAG",p="SEARCH_SUGGEST",G="SAVE_FORM_INFO",f="GET_FORM_INFO_CACHE",W="CLEAR_FORM_INFO_CACHE",y="SAVE_MULTISTEP_LOGIN",U="GET_FD_WEIGHTS",w="GET_FD_EXCEPTIONS",B="GET_FD_CRF_PARAMS",H="CLEAR_DWS_INFO",b="GET_CACHED_DWS_INFO",v="UPDATE_DWS_WHITELIST",V="LAUNCH_IDPS_LOGIN",k="UPDATE_DWS_SHOWN",x="GET_APS_DETAILS",Y="SIGN_UP_FORM_DETECTED",K="SET_FF_POLICY_COLLECTION",q="SET_FF_POLICY_LAST_SHOWN",X="PING_CONTENT_SITE_LISTENER",Q="BROADCAST_TO_FOREGROUND",J=0,j=23,z=24,Z=0;class ${constructor(e){this.pingCommand=e,this.basePingListener()}basePingListener(e=null){chrome.runtime.onMessage.addListener(((s,t,n)=>{if(t.id!==chrome.runtime.id)return;const{command:a}=s;a===this.pingCommand&&(n({content:!0}),"function"==typeof e&&e())}))}}const ee=chrome;class se{static handlePromiseMessage(e,s=null){return new Promise(((t,n)=>{chrome.runtime.sendMessage(e,(e=>{"function"==typeof s?s(t,n,e):((e,s,t)=>{chrome.runtime.lastError&&s(chrome.runtime.lastError.message),e(t)})(t,n,e)}))}))}}class te{static localStore(s,t){const n=e;return se.handlePromiseMessage({command:n,action:s,data:t})}static sessionStore(s,t){const n=e;return se.handlePromiseMessage({command:n,action:s,data:t})}static isFrameBlocked(e){const s=I;return se.handlePromiseMessage({command:s,url:e})}static makeMTIRequest(e,s){const t={command:m,requestData:e,referer:s};return se.handlePromiseMessage(t)}static executeCommand(e,s){const n=t;ee.runtime.sendMessage({command:n,commandId:e,params:s})}static focusOrCreateTab(e){const s=n;ee.runtime.sendMessage({command:s,url:e})}static closeTab(){const e=r;ee.runtime.sendMessage({command:e})}static whitelist(e,s,t){const n=E;return se.handlePromiseMessage({action:e,command:n,type:s,data:t})}static getPopupData(){const e=S;return se.handlePromiseMessage({command:e})}static getSettingsData(){const e=l;return se.handlePromiseMessage({command:e})}static searchAnnotation(e,s){const t=C;return se.handlePromiseMessage({action:e,data:s,command:t})}static socialMediaAnnotation(e,s){const t=R;return se.handlePromiseMessage({action:e,data:s,command:t})}static async getBkGlobals(e=!1){return new Promise((s=>{const t=a;se.handlePromiseMessage({command:t,bIncludeSearchEngines:e}).then((e=>{s(JSON.parse(e))}))}))}static viewSiteReport(e=null,s=!1){const t=N;ee.runtime.sendMessage({command:t,url:e,showInNewTab:s})}static getTypoSquattingData(e){const s=A;return se.handlePromiseMessage({command:s,domain:e})}static getPlaceholderText(e){const s=i;return se.handlePromiseMessage({command:s,id:e})}static setViewPort(e,s){const t=T;ee.runtime.sendMessage({command:t,x:e,y:s})}static sendTelemetry(e){const s=d;ee.runtime.sendMessage({command:s,telemetry:e})}static anyBlockedIframes(e){const s=P;return se.handlePromiseMessage({command:s,frameUrls:e})}static anyBlockedCryptoScripts(){const e=O;return se.handlePromiseMessage({command:e})}static resetSettings(){const e=M;ee.runtime.sendMessage({command:e})}static sendEngineStat(e){ee.runtime.sendMessage({command:L,engine:e})}static contentHandler(e){const t=s;ee.runtime.sendMessage({command:t,message:e})}static getTabData(e={}){const s={command:c,...e};return se.handlePromiseMessage(s)}static isWhitelisted(e){const s={command:h,url:e};return se.handlePromiseMessage(s)}static getExtensionStatus(e){return se.handlePromiseMessage({command:o,extension_id:e})}static unblockAllIframes(){const e=D;ee.runtime.sendMessage({command:e})}static updateRatDetectionShowingFlag(e){const s=F;ee.runtime.sendMessage({command:s,showed:e})}static getSearchSuggest(e){const s={command:p,searchTerm:e};return se.handlePromiseMessage(s)}static resetNativeSetting(e){const s=_;ee.runtime.sendMessage({command:s,setting:e})}static saveFormInfo(e,s){const t=G;ee.runtime.sendMessage({command:t,username:e,hostname:s})}static saveMultiStepLogin(e,s){const t=y;ee.runtime.sendMessage({command:t,data:e,completeLogin:s})}static getFormInfoCache(){const e=f;return se.handlePromiseMessage({command:e})}static clearFormInfoCache(){const e=W;ee.runtime.sendMessage({command:e})}static updateDWSWhitelist(e){const s=v;ee.runtime.sendMessage({command:s,email:e})}static getCachedDWSInfo(e){const s={command:b,email:e};return se.handlePromiseMessage(s)}static clearCachedDWSInfo(e){const s=H;ee.runtime.sendMessage({command:s,email:e})}static updateDWSShown(e){const s=k;ee.runtime.sendMessage({command:s,email:e})}static getAPSDetails(){const e=x;return se.handlePromiseMessage({command:e})}static signUpFormDetected(){const e=Y;ee.runtime.sendMessage({command:e})}static updateBkNativeSettings(e,s){const t=g;ee.runtime.sendMessage({command:t,name:e,value:s})}static launchIDPSLogin(){const e=V;ee.runtime.sendMessage({command:e})}static showSidebarMain(){const e=u;ee.runtime.sendMessage({command:e})}static setFFPolicyCollection({personal:e,activity:s}){const t=K;ee.runtime.sendMessage({command:t,personal:e,activity:s})}static setFFPolicyLastShown(){const e=q;ee.runtime.sendMessage({command:e})}static broadcastToForeground(e){const s=Q;ee.runtime.sendMessage({command:s,payload:e})}static getFDWeights(){const e=U;return se.handlePromiseMessage({command:e})}static getFDExceptions(){const e=w;return se.handlePromiseMessage({command:e})}static getFDCrfParams(){const e=B;return se.handlePromiseMessage({command:e})}}(new class extends ${constructor(){super(X)}main(){window.addEventListener("message",(e=>{if(!e)return;const{data:s}=e;if(!s)return;const{request_type:t,payload:n}=s;if(void 0!==t&&void 0!==n){if(t!==J||n.done||window.postMessage({request_type:Z,payload:{done:!0}},e.origin),t===j){const e=chrome.runtime.getURL("html/settings.html");te.focusOrCreateTab(e)}t===z&&te.showSidebarMain()}}),!1)}}).main()})();
//# sourceMappingURL=../sourceMap/chrome/scripts/content_site_listener.js.map