(window.webpackJsonp=window.webpackJsonp||[]).push([[14],{OcFR:function(e,t,a){"use strict";a.r(t),a.d(t,"_frontmatter",(function(){return b})),a.d(t,"default",(function(){return u}));var n,l=a("k1TG"),c=a("8o2o"),o=(a("q1tI"),a("7ljp")),r=a("013z"),b=(a("qKvR"),{}),i=(n="PageDescription",function(e){return console.warn("Component "+n+" was not imported, exported, or provided by MDXProvider as global scope"),Object(o.b)("div",e)}),p={_frontmatter:b},s=r.a;function u(e){var t=e.components,a=Object(c.a)(e,["components"]);return Object(o.b)(s,Object(l.a)({},p,a,{components:t,mdxType:"MDXLayout"}),Object(o.b)(i,{mdxType:"PageDescription"},"This article outlines the build process from a local machine and from the build server (Travis, GitHub actions)."),Object(o.b)("p",null,"There are two "),Object(o.b)("h1",null,"Build: GitHub actions"),Object(o.b)("h1",null,"Build: Travis"),Object(o.b)("p",null,"The build with ",Object(o.b)("a",Object(l.a)({parentName:"p"},{href:"https://travis-ci.com/IBM/FHIR"}),"Travis")," is triggered through a ",Object(o.b)("inlineCode",{parentName:"p"},"push")," or ",Object(o.b)("inlineCode",{parentName:"p"},"pull_request")," or ",Object(o.b)("inlineCode",{parentName:"p"},"cron")," event.  The ",Object(o.b)("inlineCode",{parentName:"p"},"push")," is the only event which is enabled in the ",Object(o.b)("strong",{parentName:"p"},"IBM FHIR Server")," build. "),Object(o.b)("h1",null,"Build: Local"),Object(o.b)("h2",null,"Build and Deploy"),Object(o.b)("h3",null,"examples"),Object(o.b)("ul",null,Object(o.b)("li",{parentName:"ul"},"set the version with rc=NUMBER where the NUMBER is version of the release. ")),Object(o.b)("pre",null,Object(o.b)("code",Object(l.a)({parentName:"pre"},{className:"language-shell"}),"mvn clean -Drc=1 -Pdeploy-version-rc -f fhir-examples/pom.xml -N\n")),Object(o.b)("ul",null,Object(o.b)("li",{parentName:"ul"},"build and deploy ")),Object(o.b)("pre",null,Object(o.b)("code",Object(l.a)({parentName:"pre"},{className:"language-shell"}),"mvn clean install javadoc:jar javadoc:test-jar -Pdeploy-bintray,fhir-javadocs deploy -f fhir-examples/pom.xml  \n")),Object(o.b)("h3",null,"tools"),Object(o.b)("ul",null,Object(o.b)("li",{parentName:"ul"},"set the version ")),Object(o.b)("pre",null,Object(o.b)("code",Object(l.a)({parentName:"pre"},{className:"language-shell"}),"mvn clean -Drc=1 -Pdeploy-version-rc -f fhir-tools/pom.xml -N\n")),Object(o.b)("ul",null,Object(o.b)("li",{parentName:"ul"},"build and deploy ")),Object(o.b)("pre",null,Object(o.b)("code",Object(l.a)({parentName:"pre"},{className:"language-shell"}),"mvn clean install javadoc:jar javadoc:test-jar -Pdeploy-bintray,fhir-javadocs deploy -f fhir-tools/pom.xml  \n")),Object(o.b)("h3",null,"parent"),Object(o.b)("ul",null,Object(o.b)("li",{parentName:"ul"},"set the version ")),Object(o.b)("pre",null,Object(o.b)("code",Object(l.a)({parentName:"pre"},{className:"language-shell"}),"mvn clean -Drc=1 -Pdeploy-version-rc -f fhir-parent/pom.xml -N\n")),Object(o.b)("ul",null,Object(o.b)("li",{parentName:"ul"},"build and deploy ")),Object(o.b)("pre",null,Object(o.b)("code",Object(l.a)({parentName:"pre"},{className:"language-shell"}),"mvn clean install javadoc:jar javadoc:test-jar -Pdeploy-bintray,fhir-javadocs deploy -f fhir-parent/pom.xml  \n")),Object(o.b)("ul",null,Object(o.b)("li",{parentName:"ul"},"Locally * The local connection to bintray takes around 30-40 minutes to build, test and deploy.  ")),Object(o.b)("h1",null,"Tips"),Object(o.b)("p",null,"If the build appears to randomly stop complaining about a 400 error, the issue might be one of the following: "),Object(o.b)("h2",null,"1 Naming of the artifactId might include a space."),Object(o.b)("p",null,"The artifactId might have a space in it. "),Object(o.b)("p",null,Object(o.b)("inlineCode",{parentName:"p"},"<artifactId>fhir-notification-websocket </artifactId>")),Object(o.b)("p",null," convert to "),Object(o.b)("p",null," ",Object(o.b)("inlineCode",{parentName:"p"},"<artifactId>fhir-notification-websocket</artifactId>")),Object(o.b)("h2",null,"2 The BinTray Key might need to be checked."),Object(o.b)("p",null,"If you are able to successfully upload, there may be a need to check BinTray via commandline. "),Object(o.b)("pre",null,Object(o.b)("code",Object(l.a)({parentName:"pre"},{}),"curl -v  --user <user>:<apiKey> -T /Users/<username>/.m2/repository/com/ibm/fhir/fhir-notification-websocket/4.0.0-rc1-20191027/fhir-notification-websocket-4.0.0-rc1-20191027.pom https://api.bintray.com/maven/ibm-watson-health/ibm-fhir-server-snapshots/fhir-notification-websocket/com/ibm/fhir/fhir-notification-websocket/4.0.0-rc1-20191027/fhir-notification-websocket-4.0.0-rc1-20191027.pom\n")))}u.isMDXComponent=!0}}]);
//# sourceMappingURL=component---src-pages-build-mdx-22bfcbd6dfd061f0a67a.js.map