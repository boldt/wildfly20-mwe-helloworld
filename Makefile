archetype-generate:
	mvn \
		-Darchetype.interactive=false \
		-DarchetypeGroupId=org.wildfly.archetype \
		-DarchetypeArtifactId=wildfly-jakartaee-webapp-archetype \
		-DarchetypeVersion=20.0.0.Final \
		\
		-DgroupId=de.dennisboldt \
		-DartifactId=helloworld \
		-Dversion=1.0 \
		\
		-Dpackage=de.dennisboldt \
		\
		--batch-mode \
		archetype:generate
