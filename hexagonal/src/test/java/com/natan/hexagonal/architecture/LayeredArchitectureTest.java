package com.natan.hexagonal.architecture;

import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.springframework.boot.test.context.SpringBootTest;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@AnalyzeClasses(packages = "com.natan.hexagonal")
@SpringBootTest
public class LayeredArchitectureTest {

    @ArchTest
    public static final ArchRule layered_architecture_test = layeredArchitecture()
            .consideringAllDependencies()
            .layer("AdapterIn").definedBy("..adapters.in..")
            .layer("AdapterOut").definedBy("..adapters.out..")
            .layer("UseCase").definedBy("..application.core.usecase..")
            .layer("PortsIn").definedBy("..application.ports.in..")
            .layer("PortsOut").definedBy("..application.ports.out..")
            .layer("Config").definedBy("..config..")
            .whereLayer("AdaptersIn").mayOnlyBeAccessedByLayers("Config")
            .whereLayer("AdaptersOut").mayOnlyBeAccessedByLayers("Config")
            .whereLayer("UseCase").mayOnlyBeAccessedByLayers("Config")
            .whereLayer("PortsIn").mayOnlyBeAccessedByLayers("UseCase", "AdaptersIn")
            .whereLayer("PortsIn").mayOnlyBeAccessedByLayers("UseCase", "AdaptersOut")
            .whereLayer("Config").mayNotBeAccessedByAnyLayer();



}
