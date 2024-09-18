package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.out.println("done1");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("done2");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("done3");
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println("done3");
	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.println("done4");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		System.out.println("done4");

	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		System.out.println("done4");

	}

	@Given("some other preconditionaaa")
	public void some_other_preconditionaaa() {

		System.out.println("done4");
	}

	@When("I complete action aa")
	public void i_complete_action_aa() {
		System.out.println("donelast");

	}

	@Given("some other preconditionaaabb vv")
	public void some_other_preconditionaaabb_vv() {
		System.out.println("nmdbscnbvnbdsmn");
	}

	@When("I complete action aabb vv")
	public void i_complete_action_aabb_vv() {
		System.out.println("nmdbscnbvnbdsmn");
	}
}
