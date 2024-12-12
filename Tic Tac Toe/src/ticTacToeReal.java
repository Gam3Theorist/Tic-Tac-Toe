import java.util.Scanner;

public class ticTacToeReal
	{
		static String[][] board = new String[3][3];
		static int[][] aiBoard = new int [3][3];
		static boolean win = false;
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);

		public static void main(String[] args)
			{
				prepareBoard();
				// displayBoard();
				// board[1][1] = "X";
				// displayBoard();
			//	hotSeat();
			//	player1();
			//	player2();
			//	aiBattle();
			//	ai();
				aiBattle2();
				playerAIBattle2();
				ai2();
				displayBoard();

			}

		public static void prepareBoard()
			{
				board[0][0] = " ";
				board[0][1] = " ";
				board[0][2] = " ";
				board[1][0] = " ";
				board[1][1] = " ";
				board[1][2] = " ";
				board[2][0] = " ";
				board[2][1] = " ";
				board[2][2] = " ";
			//--------------------*
				aiBoard[0][0] = 0;
				aiBoard[0][1] = 0;
				aiBoard[0][2] = 0;
				aiBoard[1][0] = 0;
				aiBoard[1][1] = 0;
				aiBoard[1][2] = 0;
				aiBoard[2][0] = 0;
				aiBoard[2][1] = 0;
				aiBoard[2][2] = 0;
			}

		public static void displayBoard()

			{
				System.out.println("    1   2   3    ");
				System.out.println(" ---------------");
				System.out.println("A | " + board[0][0] + " | " + board[0][1] + " | " + board[0][2] + " | ");
				System.out.println(" ---------------");
				System.out.println("B | " + board[1][0] + " | " + board[1][1] + " | " + board[1][2] + " | ");
				System.out.println(" ---------------");
				System.out.println("C | " + board[2][0] + " | " + board[2][1] + " | " + board[2][2] + " | ");
				System.out.println(" ---------------");
			}

		public static void hotSeat()
{
	while (win == false)
		{
			player1();
			player2();
		}
}
		
		public static void player1()
			{
				
					{
						System.out.println("Where would you like to place X player 1? (letter first, number second)");
						String p1choice1 = userStringInput.nextLine();
						if (p1choice1.equals("A1")&& board[0][0].equals(" "))
							{
								board[0][0] = "X";
								displayBoard();
							} else if (p1choice1.equals("A2")&& board[0][1].equals(" "))
							{
								board[0][1] = "X";
								displayBoard();
							} else if (p1choice1.equals("A3")&& board[0][2].equals(" "))
							{
								board[0][2] = "X";
								displayBoard();
							} else if (p1choice1.equals("B1")&& board[1][0].equals(" "))
							{
								board[1][0] = "X";
								displayBoard();
							} else if (p1choice1.equals("B2")&& board[1][1].equals(" "))
							{
								board[1][1] = "X";
								displayBoard();
							} else if (p1choice1.equals("B3")&& board[1][2].equals(" "))
							{
								board[1][2] = "X";
								displayBoard();
							} else if (p1choice1.equals("C1")&& board[2][0].equals(" "))
							{
								board[2][0] = "X";
								displayBoard();
							} else if (p1choice1.equals("C2")&& board[2][1].equals(" "))
							{
								board[2][1] = "X";
								displayBoard();
							} else if (p1choice1.equals("C3")&& board[2][2].equals(" "))
							{
								board[2][2] = "X";
								displayBoard();
							}
							else
								{
									player1();
								}
						winCondition();
					}
			}

		public static void player2()

			{
				System.out.println("Now, player 2, where would you like to place O?");
				String p2choice1 = userStringInput.nextLine();
				if (p2choice1.equals("A1") && board[0][0].equals(" "))
					{
						board[0][0] = "O";
						displayBoard();
					}
				else if (p2choice1.equals("A2")&& board[0][1].equals(" "))
					{
						board[0][1] = "O";
						displayBoard();
					} 
				else if (p2choice1.equals("A3")&& board[0][2].equals(" "))
					{
						board[0][2] = "O";
						displayBoard();
					} 
				else if (p2choice1.equals("B1")&& board[1][0].equals(" "))
					{
						board[1][0] = "O";
						displayBoard();
					} 
				else if (p2choice1.equals("B2")&& board[1][1].equals(" "))
					{
						board[1][1] = "O";
						displayBoard();
					} 
				else if (p2choice1.equals("B3")&& board[1][2].equals(" "))
					{
						board[1][2] = "O";
						displayBoard();
					} 
				else if (p2choice1.equals("C1")&& board[2][0].equals(" "))
					{
						board[2][0] = "O";
						displayBoard();
					} 
				else if (p2choice1.equals("C2")&& board[2][1].equals(" "))
					{
						board[2][1] = "O";
						displayBoard();
					} 
				else if (p2choice1.equals("C3")&& board[2][2].equals(" "))
					{
						board[2][2] = "O";
						displayBoard();
					}
				else
					{
player2();
					}
				winCondition();
	}

		public static void aiBattle()
	{
		while (win == false)
			{
				player1();
				ai();
			}
	}
		
		public static void ai()
{
	int aiChoice = (int) ((Math.random()*9));
	if (aiChoice==0 && !board[0][0].equals(" "))
		{
			board[0][0] = "O";
			displayBoard();
			aiBoard[0][0] = 5;
		}
	else if (aiChoice==1 && board[0][1].equals(" "))
		{
			board[0][1] = "O";
			displayBoard();
			aiBoard[0][1] = 5;
		} 
	else if (aiChoice==2 && board[0][2].equals(" "))
		{
			board[0][2] = "O";
			displayBoard();
			aiBoard[0][2] = 5;
		} 
	else if (aiChoice==3 && board[1][0].equals(" "))
		{
			board[1][0] = "O";
			displayBoard();
			aiBoard[1][0] = 5;
		} 
	else if (aiChoice==4 && board[1][1].equals(" "))
		{
			board[1][1] = "O";
			displayBoard();
			aiBoard[1][1] = 5;
		} 
	else if (aiChoice==5 && board[1][2].equals(" "))
		{
			board[1][2] = "O";
			displayBoard();
			aiBoard[1][2] = 5;
		} 
	else if (aiChoice==6 && board[2][0].equals(" "))
		{
			board[2][0] = "O";
			displayBoard();
			aiBoard[2][0] = 5;
		} 
	else if (aiChoice==7 && board[2][1].equals(" "))
		{
			board[2][1] = "O";
			displayBoard();
			aiBoard[2][1] = 5;
		} 
	else if (aiChoice==8 && board[2][2].equals(" "))
		{
			board[2][2] = "O";
			displayBoard();
			aiBoard[2][2] = 5;
		}
	else
		{
ai();
		}
	System.out.println("The AI placed an O!");
	winCondition();
}
	
		public static void aiBattle2()
		{
			while (win == false)
				{
					player1();
					ai2();
				}
		}
		
		public static void ai2()
		{
			rowCheck();
			colmnCheck();
			ai();
				}
			
		public static void rowCheck()
			{
				int rowTotal=0;
				for (int row=0; row < board.length; row++ )
					{
						 rowTotal=0;
		
						for (int colmn=0; colmn< board[0].length; colmn++)
							{
								rowTotal+=aiBoard[row][colmn-1];
								
									if(rowTotal==10)
										{
											for (int i=0; i< aiBoard[0].length; i++)
												{
													if(board [row][colmn].equals(" "))
																{
																	board[row][colmn].equals("O");
																}
												}
										}					
							}
					}
			}
					
		public static void colmnCheck()
					{
						int colmnTotal=0;
						for (int colmn=0; colmn < board.length; colmn++ )
							{
								 colmnTotal=0;
				
								for (int row=0; row< board[0].length; row++)
									{
										colmnTotal+=aiBoard[row][colmn];
										
											if(colmnTotal==10)
												{
													for (int i=0; i< aiBoard.length; i++)
														{
															if(board [row][colmn].equals(" "))
																		{
																			board[row][colmn].equals("O");
																		}
														}
												}					
									}
							}
					}
	
		public static void diagonalCheck()
		{
			
		}
			
		
		
		public static void playerAIBattle2()
		{
			System.out.println("Where would you like to place X player 1? (letter first, number second)");
			String p1choice1 = userStringInput.nextLine();
			if (p1choice1.equals("A1")&& board[0][0].equals(" "))
				{
					board[0][0] = "X";
					displayBoard();
					aiBoard[0][0]=2;
				} 
			else if (p1choice1.equals("A2")&& board[0][1].equals(" "))
				{
					board[0][1] = "X";
					displayBoard();
					aiBoard[0][1]=2;
				} 
			else if (p1choice1.equals("A3")&& board[0][2].equals(" "))
				{
					board[0][2] = "X";
					displayBoard();
					aiBoard[0][2]=2;
				} 
			else if (p1choice1.equals("B1")&& board[1][0].equals(" "))
				{
					board[1][0] = "X";
					displayBoard();
					aiBoard[1][0]=2;
				}
			else if (p1choice1.equals("B2")&& board[1][1].equals(" "))
				{
					board[1][1] = "X";
					displayBoard();
					aiBoard[1][1]=2;
				} 
			else if (p1choice1.equals("B3")&& board[1][2].equals(" "))
				{
					board[1][2] = "X";
					displayBoard();
					aiBoard[1][2]=2;
				} 
			else if (p1choice1.equals("C1")&& board[2][0].equals(" "))
				{
					board[2][0] = "X";
					displayBoard();
					aiBoard[2][0]=2;
				} 
			else if (p1choice1.equals("C2")&& board[2][1].equals(" "))
				{
					board[2][1] = "X";
					displayBoard();
					aiBoard[2][1]=2;
				} 
			else if (p1choice1.equals("C3")&& board[2][2].equals(" "))
				{
					board[2][2] = "X";
					displayBoard();
					aiBoard[2][2]=2;
				}
				else
					{
						player1();
					}
			winCondition();
		}
		
		
		public static void winCondition()
			{
				if ((board[0][0].equals(board[0][1]) && board[0][1].equals(board[0][2]) && !board[0][1].equals(" "))
						|| (board[1][0].equals(board[1][1]) && board[1][1].equals(board[1][2])
								&& !board[1][1].equals(" "))
						|| (board[2][0].equals(board[2][1]) && board[2][1].equals(board[2][2])
								&& !board[2][1].equals(" "))
						|| (board[0][0].equals(board[1][0]) && board[1][0].equals(board[2][0])
								&& !board[1][0].equals(" "))
						|| (board[0][1].equals(board[1][1]) && board[1][1].equals(board[2][1])
								&& !board[1][1].equals(" "))
						|| (board[0][2].equals(board[1][2]) && board[1][2].equals(board[2][2])
								&& !board[1][2].equals(" "))
						|| (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])
								&& !board[1][1].equals(" "))
						|| (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])
								&& !board[1][1].equals(" ")))
					{
						System.out.println("The game is over!");
						System.exit(0);// what it do?
						// System.out.println("Play again? ");
						// System.out.println("Yes");
						// System.out.println("No");
						// String playagain = userStringInput.nextLine();
						// if(playagain.equals("Yes") || playagain.equals("yes"))
						// {
						//
						// }
						// else
						// {
						// System.out.println("Thanks for playing!");
						// win= true;
						// }
					}

			}
	}// *
