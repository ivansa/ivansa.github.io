---
layout: post
title: "SQL Server 2008 Error : 'Access is Denied'"
date: 2014-02-27 08:41
comments: true
categories: windows_microsoft
---

I have been trying to resolve an issue while installing SQL Server 2008 Express on a Windows XP SP3 machine.  I kept getting an "Access is Denied" error in the logs.
<!--more-->

Here's the error itself : 
```
2012-06-20 09:27:58 Slp: Configuration action failed for feature SQL_Engine_Core_Inst during timing ConfigNonRC and scenario ConfigNonRC.
2012-06-20 09:27:58 Slp: Access is denied
2012-06-20 09:27:58 Slp: Configuration action failed for feature SQL_Engine_Core_Inst during timing ConfigNonRC and scenario ConfigNonRC.
2012-06-20 09:27:58 Slp: System.ComponentModel.Win32Exception (0x80004005): Access is denied
2012-06-20 09:27:58 Slp:    at Microsoft.SqlServer.Configuration.SqlEngine.RsFxConfiguration.Install()
2012-06-20 09:27:58 Slp:    at Microsoft.SqlServer.Configuration.SqlEngine.FilestreamConfiguration.Install()
2012-06-20 09:27:58 Slp:    at Microsoft.SqlServer.Configuration.SqlEngine.SqlEngineSetupPrivate.SetupFilestream(EffectiveProperties properties)
2012-06-20 09:27:58 Slp:    at Microsoft.SqlServer.Configuration.SqlEngine.SqlEngineSetupPrivate.Install_ConfigNonRC_Prepare(EffectiveProperties properties)
2012-06-20 09:27:58 Slp:    at Microsoft.SqlServer.Configuration.SqlEngine.SqlEngineSetupPrivate.Install(ConfigActionTiming timing, Dictionary`2 actionData, PublicConfigurationBase spcb)
2012-06-20 09:27:58 Slp:    at Microsoft.SqlServer.Configuration.SqlConfigBase.PrivateConfigurationBase.Execute(ConfigActionScenario scenario, ConfigActionTiming timing, Dictionary`2 actionData, PublicConfigurationBase spcbCurrent)
2012-06-20 09:27:58 Slp:    at Microsoft.SqlServer.Configuration.SqlConfigBase.SqlFeatureConfigBase.Execute(ConfigActionScenario scenario, ConfigActionTiming timing, Dictionary`2 actionData, PublicConfigurationBase spcbCurrent)
2012-06-20 09:27:58 Slp:    at Microsoft.SqlServer.Configuration.SqlConfigBase.SlpConfigAction.ExecuteAction(String actionId)
2012-06-20 09:27:58 Slp:    at Microsoft.SqlServer.Configuration.SqlConfigBase.SlpConfigAction.Execute(String actionId, TextWriter errorStream)
2012-06-20 09:27:58 Slp: Exception: System.ComponentModel.Win32Exception.
2012-06-20 09:27:58 Slp: Source: Microsoft.SqlServer.Configuration.SqlServer_ConfigExtension.
2012-06-20 09:27:58 Slp: Message: Access is denied.
```

I tried the steps mentioned on MULTIPLE websites that all basically copied this <a href="http://support.microsoft.com/kb/2000257">KB article</a>.  Unfortunately, that didn't help.  So, I kept digging.. and digging.. and digging.  I finally was reminded of Process Explorer, which can be downloaded <a href="http://technet.microsoft.com/en-us/sysinternals/bb896645.aspx">here</a>, and I ran that while the setup was running to figure out what access was being "denied."

Keep in mind, these steps are for Windows XP SP3 and they assume that your account is in the Administrators group.  So, if you're troubleshooting on Windows Vista, 7, or one of the Server products, the steps may be different.  And if you don't have Administrator access, you'll need to get that too.  But, here's what I did to solve my problem.

* Open RegEdit.
* Browse to : HKEY_LOCAL_MACHINE\SYSTEM\CurrentControlSet\Control\WMI
* Right-click on <b>Security</b> and open Permissions.

<img src="{{root_url}}/images/blog/windows_microsoft/sql_server_2008_setup_error/open-permissions.png" style="border:1px solid grey">

* Make sure the Administrators group has Full Control.

<img src="{{root_url}}/images/blog/windows_microsoft/sql_server_2008_setup_error/permissions.png" style="border:1px solid grey">



* If Administrators do not have Full Control, click the checkbox under "allow," next to Full Control. 
* Click Ok.
* Re-run setup.

I hope this helps someone.

Thanks for reading this!<br />
Michael 


