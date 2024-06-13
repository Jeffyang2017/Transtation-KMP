/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://maven.google.com/")
        maven (" https://www.jitpack.io")
        maven ("https://mirrors.cloud.tencent.com/maven")
        maven(  "https://mirrors.huaweicloud.com/repository/maven/" )
        maven ("https://maven.aliyun.com/repository/google")  // Google仓库镜像
        maven ("https://maven.aliyun.com/repository/public") // Maven Central仓库镜像
        maven ("https://mirrors.tencent.com/repository/maven-google") // Google仓库镜像
        maven ("https://mirrors.tencent.com/repository/central") // Maven Central仓库镜像
        maven ("https://repo.huaweicloud.com/repository/maven/") // Huawei Maven仓库
        maven("https://repo1.maven.org/maven2/")
        maven("https://maven.aliyun.com/repository/public/")
        maven("https://maven.aliyun.com/repository/google/")
        maven("https://maven.aliyun.com/repository/jcenter/")

        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev/")
        maven("https://s01.oss.sonatype.org/content/repositories/snapshots/")
    }

    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = "build-logic"
include(":convention")
