/*
 * Copyright 2019 Google, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.spinnaker.rosco.manifests;

import com.netflix.spinnaker.kork.artifacts.model.Artifact;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

public interface ArtifactDownloader {
  InputStream downloadArtifact(Artifact artifact) throws IOException;

  InputStream downloadArtifact(Artifact artifact, int maxRetries) throws IOException;

  void downloadArtifactToFile(Artifact artifact, Path targetFile) throws IOException;
}
