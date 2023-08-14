@Library("VirtasantPipelines@update-co-pipeline") _

grafanaPipeline {
    publish = true
    deploy = true
    prNode = 'dev-dp-node'
    devNode = 'dev-dp-node'
    buildParameters = ' --platform linux/amd64 \
    --build-arg BINGO=false \
	--build-arg WIRE_TAGS="oss" \
    '
	// --build-arg COMMIT_SHA=$$(git rev-parse --short HEAD) \
	// --build-arg BUILD_BRANCH=$$(git rev-parse --abbrev-ref HEAD)'
}
