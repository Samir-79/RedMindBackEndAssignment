# RedMindBackEndAssignment
Instructions on how to run the application:
Local IDE:
-Clone the project and run it on your local IDE.
-Program is written in Java version 17.
-Open terminal in your IDE and run command: mvn cean install
-In the folder-structure go to: RedMindBackEndAssignment->src->main->java->Main and run the program.
-You will be subsequently asked to press Enter seven times to make seven withdrawals.
-Program terminates automatically after seventh withdrawal.
-In the folder structure go to:RedMindBackEndAssignment->src->test->java->RunWithDrawalsTest and run the tests.
-In the folder structure go to:RedMindBackEndAssignment->src->test->java->PhrasedNumberTest and run the tests.





What parts did you struggle with and why?
-Getting the main functionality to run according to the assignment requirements was a bit challenging, I tried several
approaches but decided at last to use the so called "greedy alogirthm" because  of its conciseness and enormous 
effectivity.
Would you do anything differently if you were to do it again?
-Yes, my solution is tailor-made to address the specific requirements of the assignment.Instead of hardcoding 
the billtype and billtype-quantity-arrays for example, one could write two  methods that would  go through an array
containing all billtypes with their duplicates
and do this automatically; but then I thought that it was not absolutely necessary since the task stated a predetermined
amount for each bill to start with.

Which framework did you choose and why? If you did not choose to use a framework, why?
-Junit(Maven dependency) for testing. I am familiar with it since we use it in our school projects.
