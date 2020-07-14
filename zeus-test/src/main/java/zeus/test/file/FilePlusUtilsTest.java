package zeus.test.file;

import com.genesis.platform.infra.common.util.file.FilePlusUtils;

import java.util.List;

/**
 * @author: KG
 * @description:
 * @date: Created in 9:33 上午 2020/7/14
 * @modified by:
 */

public class FilePlusUtilsTest {
    private static void combinePathPackageAndModuleTest() {
        String basePath = "/Users/kg/develop/CodeGenerate/";
        String module = "permission_center";
        String pkgName = "com.genesis.micro.infra.security.permission";

        String combinePath = FilePlusUtils.combinePathPackageAndModule(basePath, pkgName, module);

        System.out.println(combinePath);
    }

    private static void listFilePathsTest() {
        String dirPath = "/Users/kg/develop/CodeGenerate/permission_center/com/genesis/micro/infra/security/permission/permission_center/service";
        String suffix = ".java";

        List<String> fileList = FilePlusUtils.listFileNames(dirPath, suffix);

        fileList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        listFilePathsTest();
    }
}
