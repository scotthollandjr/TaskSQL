// import org.fluentlenium.adapter.FluentTest;
// import org.junit.ClassRule;
// import org.junit.Test;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.htmlunit.HtmlUnitDriver;
// import static org.assertj.core.api.Assertions.assertThat;
// import static org.fluentlenium.core.filter.FilterConstructor.*;
//
// public class AppTest extends FluentTest {
//   public WebDriver webDriver = new HtmlUnitDriver();
//
//   @Override
//   public WebDriver getDefaultDriver() {
//     return webDriver;
//   }
//
//   @ClassRule
//   public static ServerRule server = new ServerRule();
//
//   @Test
//   public void rootTest() {
//     goTo("http://localhost:4567/");
//     assertThat(pageSource()).contains("Couch!");
//     assertThat(pageSource()).contains("View Category List");
//     assertThat(pageSource()).contains("Add a New Category");
//   }
//   @Test
//     public void categoryIsCreatedTest(){
//       goTo("http://localhost:4567/");
//       click("a", withText("Add a New Category"));
//       fill("#newCategory").with("Household chores");
//       submit(".btn");
//       assertThat(pageSource()).contains("Your category has been saved.");
//     }
//     @Test
//     public void categoryIsDisplayedTest() {
//       goTo("http://localhost:4567/categories/new");
//       fill("#newCategory").with("Household chores");
//       submit(".btn");
//       click("a", withText("View categories"));
//       assertThat(pageSource()).contains("Household chores");
//     }
//
//     @Test
//     public void categoryShowPageDisplaysName() {
//       goTo("http://localhost:4567/categories/new");
//       fill("#newCategory").with("Household chores");
//       submit(".btn");
//       click("a", withText("View categories"));
//       click("a", withText("Household chores"));
//       assertThat(pageSource()).contains("Household chores");
//     }
//     @Test
//     public void categoryTasksFormIsDisplayed() {
//       goTo("http://localhost:4567/categories/new");
//       fill("#newCategory").with("Shopping");
//       submit(".btn");
//       click("a", withText("View categories"));
//       click("a", withText("Shopping"));
//       click("a", withText("Add a new task"));
//       assertThat(pageSource()).contains("Add a task to Shopping");
//     }
//
//     @Test
//     public void tasksIsAddedAndDisplayed() {
//       goTo("http://localhost:4567/categories/new");
//       fill("#newCategory").with("Banking");
//       submit(".btn");
//       click("a", withText("View categories"));
//       click("a", withText("Banking"));
//       click("a", withText("Add a new task"));
//       fill("#description").with("Deposit paycheck");
//       submit(".btn");
//       click("a", withText("View categories"));
//       click("a", withText("Banking"));
//       assertThat(pageSource()).contains("Deposit paycheck");
//     }
//   //
//   // @Test
//   // public void taskShowPageDisplaysDescription() {
//   //   goTo("http://localhost:4567/tasks/new");
//   //   fill("#description").with("Do the dishes");
//   //   submit(".btn");
//   //   click("a", withText("View tasks"));
//   //   click("a", withText("Do the dishes"));
//   //   assertThat(pageSource()).contains("Do the dishes");
//   // }
//   //
//   // @Test
//   // public void taskNotFoundMessageShown() {
//   //   goTo("http://localhost:4567/tasks/999");
//   //   assertThat(pageSource()).contains("Task not found");
//   // }
// }
