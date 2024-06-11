rootProject.name = "Transtation-KMP"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {

/*        maven ("https://maven.aliyun.com/repository/google")  // Google仓库镜像
        maven ("https://maven.aliyun.com/repository/public") // Maven Central仓库镜像
        maven ("https://mirrors.tencent.com/repository/maven-google") // Google仓库镜像
        maven ("https://mirrors.tencent.com/repository/central") // Maven Central仓库镜像
        maven ("https://repo.huaweicloud.com/repository/maven/") // Huawei Maven仓库*/
        maven("https://maven.aliyun.com/repository/public/")
        maven("https://maven.aliyun.com/repository/google/")
        maven("https://maven.aliyun.com/repository/jcenter/")
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://plugins.gradle.org/m2/")
        maven (" https://jitpack.io")
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
/*        maven (" https://jitpack.io")
        maven ("https://maven.aliyun.com/repository/google")  // Google仓库镜像
        maven ("https://maven.aliyun.com/repository/public") // Maven Central仓库镜像
        maven ("https://mirrors.tencent.com/repository/maven-google") // Google仓库镜像
        maven ("https://mirrors.tencent.com/repository/central") // Maven Central仓库镜像
        maven ("https://repo.huaweicloud.com/repository/maven/") // Huawei Maven仓库*/
        maven("https://maven.aliyun.com/repository/public/")
        maven("https://maven.aliyun.com/repository/google/")
        maven("https://maven.aliyun.com/repository/jcenter/")
         mavenCentral()
        maven("https://repo1.maven.org/maven2/")
        maven("https://jitpack.io")
         maven("https://maven.google.com/")
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev/")
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
    }
}

// 添加自定义脚本
includeBuild("build-logic")

include(":composeApp")
include(":base-kmp")
include(":ai")
include(":login")

include(":android-code-editor:editor", ":android-code-editor:language-base", ":android-code-editor:language-universal")
include(":code-editor")

// https://www.jianshu.com/p/a6a221e04d30
include(":local_repo:monet")


