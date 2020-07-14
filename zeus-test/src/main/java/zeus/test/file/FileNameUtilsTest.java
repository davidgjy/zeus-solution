package zeus.test.file;

import com.genesis.platform.infra.common.util.file.FileNameUtils;

/**
 * @author: KG
 * @description:
 * @date: Created in 11:11 上午 2020/7/14
 * @modified by:
 */

public class FileNameUtilsTest {
    private static void changeServiceToRepositoryTest() {
        String oldName = "ISysUserRoleService.java";
        String newName = FileNameUtils.changeServiceToRepository(oldName);

        System.out.println(newName);
    }

    public static void main(String[] args) {
        changeServiceToRepositoryTest();
    }
}
