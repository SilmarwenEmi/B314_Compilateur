package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314commentsSyntaxTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314commentsSyntaxTest.class);

    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder(); // Create a temporary folder for outputs deleted after tests

    @Rule
    public TestRule watcher = new TestWatcher() { // Prints message on logger before each test
        @Override
        protected void starting(Description description) {
            LOG.info(String.format("Starting test: %s()...",
                    description.getMethodName()));
        }
    ;
    };

    //
    // Serie comments OK
    //
    @Test
    public void testcomments_comments_everywhere_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/comments_everywhere.b314", testFolder.newFile(), true, "comments: comments_everywhere");
    }

    @Test
    public void testcomments_empty_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/empty.b314", testFolder.newFile(), true, "comments: empty");
    }

    @Test
    public void testcomments_empty_multiple_lines_and_tab_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/empty_multiple_lines_and_tab.b314", testFolder.newFile(), true, "comments: empty_multiple_lines_and_tab");
    }

    @Test
    public void testcomments_bool_right_exp_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/affect_bool_right_exp.b314", testFolder.newFile(), true, "comments: bool right expr");
    }


    //
    // Serie comments KO
    //
    @Test
    public void testcomments_at_least_one_instruction_in_default_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/at_least_one_instruction_in_default.b314", testFolder.newFile(), false, "comments: at_least_one_instruction_in_default");
    }

    @Test
    public void testcomments_missing_declare_bloc_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/missing_declare_bloc.b314", testFolder.newFile(), false, "comments: missing_declare_bloc");
    }

    @Test
    public void testcomments_missing_default_bloc_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/missing_default_bloc.b314", testFolder.newFile(), false, "comments: missing_default_bloc");
    }


    // Tests By Groupe 4
    @Test
    public void testcomments_same_id_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/test_same_id.b314", testFolder.newFile(),false,"SAME ID ");
    }

    @Test
    public void testcomments_multifunction_with_same_name_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/test_multifunction_with_same_name.b314", testFolder.newFile(),false,"Function with same name");
    }

    @Test
    public void testcomments_index_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/index_error.b314", testFolder.newFile(),false,"INDEX ERROR");
    }

    @Test
    public void testcomments_boolean_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ko/boolexpression_equal_mismatching_type2.b314", testFolder.newFile(),false," boolean expression equal type 2");
    }

    @Test
    public void testcomments_multi_parameter_and_function_with_parameter() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/multi_global_var_func_param.b314", testFolder.newFile(),false," error ok, multi global var func");
    }


    @Test
    public void testtestfunct_multi_glob_vars_and_func_no_local_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/testfunct_multi_glob_vars_and_func_no_local_var_ok.b314", testFolder.newFile(),false," error ok, multi global var func");
    }

    //echeance 2

    @Test
    public void if_else_sub_affect_wrong_type_condition_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ko/if_else_with_sub_affect_wrong_type_condition.b314", testFolder.newFile(),false,"if_else_with_sub_affect_wrong_type_condition ko");
    }

    @Test
    public void if_else_sub_compute_wrong_type_condition_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ko/if_else_with_sub_compute_wrong_type_condition.b314", testFolder.newFile(),false,"if_else_with_sub_compute_wrong_type_condition ko");
    }

    @Test
    public void if_else_wrong_type_condition_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ko/if_else_wrong_type_condition.b314", testFolder.newFile(),false,"if_else_wrong_type_condition");
    }

    @Test
    public void if_else_wrong_type_condition_1_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ko/if_else_wrong_type_condition_1.b314", testFolder.newFile(),false,"if_else_wrong_type_condition_1");
    }

    @Test
    public void if_else_wrong_type_condition_2_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ko/if_else_wrong_type_condition_2.b314", testFolder.newFile(),false,"if_else_wrong_type_condition_2");
    }

    @Test
    public void if_with_sub_affect_wrong_type_condition_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ko/if_with_sub_affect_wrong_type_condition_1.b314", testFolder.newFile(),false,"if_with_sub_compute_wrong_type_condition");
    }

    @Test
    public void if_with_sub_compute_wrong_type_condition_1_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ko/if_with_sub_compute_wrong_type_condition_1.b314", testFolder.newFile(),false,"if_with_sub_compute_wrong_type_condition");
    }

    @Test
    public void if_with_sub_if_wrong_type_1_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ko/if_with_sub_if_wrong_type_1.b314", testFolder.newFile(),false,"if_with_sub_if_wrong_type_1");
    }

    @Test
    public void if_wrong_type_condition_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ko/if_wrong_type_condition.b314", testFolder.newFile(),false,"if_wrong_type_condition");
    }

    @Test
    public void if_wrong_type_condition_1_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ko/if_wrong_type_condition_1.b314", testFolder.newFile(),false,"if_wrong_type_condition_1");
    }

    @Test
    public void if_wrong_type_condition_2_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/ifinstruction/ko/if_wrong_type_condition_2.b314", testFolder.newFile(),false,"if_wrong_type_condition_2");
    }

    @Test
    public void localvar_Mixing_OK() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/localvar_mixing.b314", testFolder.newFile(),true,"mixing error");
    }


    @Test
    public void same_var_name_diff_type_when_OK() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/same_var_name_diff_type_when.b314", testFolder.newFile(),true,"same_var_name_diff_type_when");
    }

    @Test
    public void when_clause_multiple_when_with_cond_OK() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/ok/when_clause_multiple_when_with_cond.b314", testFolder.newFile(),true,"when_clauseError");
    }


    @Test
    public void multiple_default_clauses_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/whenClause/ko/multiple_default_clauses.b314", testFolder.newFile(),false,"when_clauseError");
    }

    @Test
    public void multiple_when_constant_conditions_skip_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/whenClause/ok/multiple_when_constant_conditions_skip.b314", testFolder.newFile(),true,"when_clauseError");
    }

    @Test
    public void multiple_when_constant_condition_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/whenClause/ok/multiple_when_with_constant_condition.b314", testFolder.newFile(),true,"when_clauseError");
    }

    @Test
    public void one_void_function_no_local_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/functionTests/ok/one_void_function_no_local_var.b314", testFolder.newFile(),true,"one_void_function_no_local_var");
    }

    @Test
    public void wrong_type_in_return_1_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/functionTests/ko/wrong_type_in_return_1.b314", testFolder.newFile(),false,"wrong_type_in_return_1_ko");
    }


    @Test
    public void while_sub_compute_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/whileclause/while_sub_compute_ko.b314", testFolder.newFile(),false,"wrong_type_in_return_1_ko");
    }

    @Test
    public void multiple_global_vars_and_functions_no_local_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/functionTests/ok/multiple_global_vars_and_functions_no_local_var.b314", testFolder.newFile(),true,"multiple_global_vars_and_functions_no_local_var");
    }

    @Test
    public void multiple_global_vars_and_functions_with_same_name_no_local_var_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/functionTests/ko/multiple_global_vars_and_functions_with_same_name_no_local_var.b314", testFolder.newFile(),false,"multiple_global_vars_and_functions_with_same_name_no_local_var");
    }

    @Test
    public void when_local_variable_same_name_as_global_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/whenClause/ok/when_local_variable_same_names_as_global_ok.b314", testFolder.newFile(),true,"when_local_variable_same_names_as_global");
    }

    @Test
    public void testfunctions_factorial_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/functionTests/ok/testfunctions_factorial_ok.b314", testFolder.newFile(),true,"when_local_variable_same_names_as_global");
    }

    @Test
    public void affect_square_constant_value_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affectinstruction/affect_square_constant_value.b314", testFolder.newFile(),true,"affect_square_constant_value");
    }
    @Test
    public void text_function() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/functionTests/ok/test_function.b314", testFolder.newFile(),true,"test function return empty");
    }

    @Test
    public void multiple_global_vars_and_functions_with_parameters_and_instructions_no_local_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/functionTests/ok/multiple_global_vars_and_functions_with_parameters_and_instructions_no_local_var.b314", testFolder.newFile(),true,"multiple_global_vars_and_functions_with_parameters_and_instructions_no_local_var");
    }

    @Test
    public void multiple_global_vars_and_functions_with_parameters_with_same_name_as_function_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/functionTests/ko/multiple_global_vars_and_functions_with_parameters_with_same_name_as_function.b314", testFolder.newFile(),false,"multiple_global_vars_and_functions_with_parameters_with_same_name_as_function");
    }

    @Test
    public void test_when_name_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/whenClause/ok/test_when_name.b314", testFolder.newFile(),true,"test_when_name");
    }

    @Test
    public void multiple_when_with_fct_call_condition_wrong_type_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/whenClause/ko/multiple_when_with_fct_call_condition_wrong_type.b314", testFolder.newFile(),false,"multiple_when_with_fct_call_condition_wrong_type");
    }

    @Test
    public void multiple_global_vars_and_functions_with_parameters_and_instructions_using_global_vars_no_local_var() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/functionTests/ok/multiple_global_vars_and_functions_with_parameters_and_instructions_using_global_vars_no_local_var.b314", testFolder.newFile(),true,"multiple_global_vars_and_functions_with_parameters_and_instructions_using_global_vars_no_local_var");
    }

    @Test
    public void when_clauses_after_default_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/whenClause/ko/when_clauses_after_default.b314", testFolder.newFile(),false,"when_clauses_after_default");
    }

    @Test
    public void when_local_var_diff_names_than_global_vars_but_same_name_in_different_whens_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/when_local_var_diff_names_than_global_vars_but_same_name_in_different_whens.b314", testFolder.newFile(),true,"when_clauses_after_default");
    }
    @Test
    public void when_local_var_same_names_and_different_types_than_global_vars_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/whenClause/ok/when_local_var_same_names_and_different_types_than_global_vars_ok.b314", testFolder.newFile(),true,"when_local_var_same_names_and_different_types_than_global_vars");
    }

    @Test
    public void operations_with_arrays_wrong_type_in_index() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/operations_with_arrays_wrong_type_in_index.b314", testFolder.newFile(),false,"when_clauses_after_default");
    }
    @Test
    public void mixing_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/mixing.b314", testFolder.newFile(),true,"mixing");
    }

    @Test
    public void set_arena_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/set_arena_ok.b314", testFolder.newFile(),true,"set arena");
    }

    @Test
    public void multiple_importfile_ko() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/comments/multiple_importfile_ko.b314", testFolder.newFile(),false,"multiple importfile");
    }


}