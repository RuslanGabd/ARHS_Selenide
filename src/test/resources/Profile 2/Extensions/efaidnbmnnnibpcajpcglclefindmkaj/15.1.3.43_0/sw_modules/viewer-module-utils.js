/*************************************************************************
* ADOBE CONFIDENTIAL
* ___________________
*
*  Copyright 2015 Adobe Systems Incorporated
*  All Rights Reserved.
*
* NOTICE:  All information contained herein is, and remains
* the property of Adobe Systems Incorporated and its suppliers,
* if any.  The intellectual and technical concepts contained
* herein are proprietary to Adobe Systems Incorporated and its
* suppliers and are protected by all applicable intellectual property laws,
* including trade secret and or copyright laws.
* Dissemination of this information or reproduction of this material
* is strictly forbidden unless prior written permission is obtained
* from Adobe Systems Incorporated.
**************************************************************************/
import{common as e}from"./common.js";import{util as t}from"./util.js";import{SETTINGS as a}from"./settings.js";import{dcLocalStorage as o}from"../common/local-storage.js";import{floodgate as s}from"./floodgate.js";let i;i||(i=new function(){this.updateVariables=function(s){try{let i=0!=s&&1!=s&&-1!=s,r=!(!i||s===a.READER_VER||s===a.ERP_READER_VER);o.setItem("locale",t.getFrictionlessLocale(chrome.i18n.getMessage("@@ui_locale"))),o.setItem("cdnUrl",e.getAcrobatViewerUri()),o.setItem("isDeskTop",i),o.setItem("env",e.getEnv()),o.setItem("viewerImsClientId",e.getViewerIMSClientId()),o.setItem("imsContextId",e.getImsContextId()),o.setItem("viewerImsClientIdSocial",e.getViewerIMSClientIdSocial()),o.setItem("imsURL",e.getIMSurl()),o.setItem("imsLibUrl",e.getImsLibUrl()),o.setItem("dcApiUri",e.getDcApiUri()),o.setItem("isAcrobat",r);let m=[this.checkFeatureEnable({flagName:"dc-cv-modern-viewer",storageKey:"modernViewerEnable"}),this.checkFeatureEnable({flagName:"dc-cv-dark-mode",storageKey:"darkModeEnable"}),this.checkFeatureEnable({flagName:"dc-cv-read-aloud",storageKey:"isReadAloudEnable"}),this.checkFeatureEnable({flagName:"dc-cv-use-old-domain",storageKey:"oldDomainRollback"}),this.checkFeatureEnable({flagName:"dc-cv-save-location-on-options",storageKey:"isSaveLocationPrefEnabled"})];return navigator.onLine&&m.push(this.checkFeatureEnable({flagName:"dc-cv-offline-support-disable",storageKey:"offlineSupportDisable"})),Promise.all(m).then((e=>{const t=e[1];o.getItem("theme")&&!t?o.removeItem("theme"):t&&!o.getItem("theme")&&o.setItem("theme","auto");const a=e[4];!a&&o.getItem("saveLocation")?o.removeItem("saveLocation"):a&&!o.getItem("saveLocation")&&o.setItem("saveLocation","ask")}))}catch(e){}},this.checkFeatureEnable=async function(e){const{flagName:t,storageKey:a}=e,i=await s.hasFlag(t);return a&&o.setItem(a,!!i),i}});export const viewerModuleUtils=i;