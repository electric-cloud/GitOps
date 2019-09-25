project "Test GitOps",{
  description = "Example generated project from FlowFile"
  pipeline "Test Pipeline",{
    stage "QA"
    stage "UAT"
    stage "PROD"
  } // afterStage:
}
