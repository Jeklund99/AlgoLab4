# AlgoLab4

## Case 1

In case one we have three comapanies and three programmers. The preferences are listed in the Main.java.
The Result (In pairs):

(Conner, Intel)
(Josh, Microsoft)
(Ryan, Apple)

Then we used the isSatisfactory method in the Pair class to check if it is satisfactory. There is a for loop at the bottom of main that cycles through every possible combination of pairs and then the method isSatisfactory checks that a pair of pairs meets the requirements. We found that the isSatisfacory method returned true for all possible pairing of pairs in this output.

## Case 2

In case two we have four companies and four programmers. 
The Result (In pairs):

(Joshua, Intel)
(Blake, Microsoft)
(Nic, Apple)
(Ash, jeffBezos)

Same thing as Case one, we used the isSatisfactory to check that each pairing of pairs meets the requirements

## Case 3

In case three we have five companies and five programmers.

(Daniel, Intel)
(Lloyd, Microsoft)
(Mason, Apple)
(Gregory, jeffBezos)
(Yubo, MarkZucc)

Same thing as Case two and Case one, we used the isSatisfactory method to check that each pairing of pairs meets the requirements.


We start by attempting to tentatively match each programmer with their favorite company. If their favorite company is already paired, then we check to see if that company preferes them over their current programmer. If their favorite company is already paired and prefers their current programmer, then we keep going down the programmer's preference list until we find a company. However, if that is true(the comapny is paired and doesn't like current programmer), the companies current programmer gets replaced with the one that is trying to be matched. Then the removed programmer goes through the process again with their second favorite company (We know this will happen since their first choice company will fail, since its paired and paired with a "better" programmer). This process happens recursively until each programmer has been matched with a company. We know this works because everytime there is an unsatisfactory relationship, we create a satisfactory one by replacing the old with the new. 

The effieciency is equal to O(n!) = O(nlgn), as stated on equation 3.19 in the textbook. In the worst case of our algorithm, every pairing we make is unsatistfactory and we have to swap every pairing to make it satistfactiory. Since we are making n! amount of pairings in the worst case, and our findMatch algorithm has O(1) operations except for the for loop, the time efficiency in the worst case is O(n!) or O(nlgn).



