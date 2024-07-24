import java.util.Scanner;

class oneQuestionException extends Exception{
	public String getMessage() {
		return "the first question is wrong sorry try next time";
	}
}
class twoQuestionException extends Exception{
	public String getMessage() {
		return "the second question is wrong  sorry try next time ";
	}
}
class threeQuestionException extends Exception{
	public String getMessage() {
		return "the third question is wrong  sorry try next time ";
	}
}
class fourQuestionException extends Exception{
	public String getMessage() {
		return "the fourth question is wrong  sorry try next time ";
	}
}
class fiveQuestionException extends Exception{
	public String getMessage() {
		return "the third question is wrong  sorry try next time ";
	}
}
class sixQuestionException extends Exception{
	public String getMessage() {
		return "the third question is wrong  sorry try next time ";
	}
}
class sevenQuestionException extends Exception{
	public String getMessage() {
		return "the third question is wrong  sorry try next time ";
	}
}
class eightQuestionException extends Exception{
	public String getMessage() {
		return "the third question is wrong  sorry try next time ";
	}
}
class nineQuestionException extends Exception{
	public String getMessage() {
		return "the third question is wrong  sorry try next time ";
	}
}
class tenQuestionException extends Exception{
	public String getMessage() {
		return "the third question is wrong  sorry try next time ";
	}
}
public class Main {
	public static void main(String args[]) {
		Members p1 = new Members();
		oneQuestionException i1=new oneQuestionException();
		twoQuestionException i2=new twoQuestionException();
		threeQuestionException i3=new threeQuestionException();
		fourQuestionException i4=new fourQuestionException();
		fiveQuestionException i5=new fiveQuestionException();
		sixQuestionException i6=new sixQuestionException();
		sevenQuestionException i7=new sevenQuestionException();
		eightQuestionException i8=new eightQuestionException();
		nineQuestionException i9=new nineQuestionException();
		tenQuestionException i10=new tenQuestionException();
		LifeLine l =new LifeLine();
		int lifeline=2;
		System.out.println("this question is for "+p1.name);
		System.out.println("In what year did the Great October Socialist Revolution take place?");
		System.out.print("A]1917"+"                "+"B]1923");
		System.out.println();
		System.out.println("C]1914"+"                "+"D]1920");
		char res1='A';
		System.out.println("Do you want  take lifeline ");
		System.out.println("Press 1 for 50-50,Press 2 for Audionce,Press 3 for to enter answer ");
		Scanner sc =new Scanner(System.in);
		int lifelinechoice=sc.nextInt();
		boolean fiftyfiftyUsed = false;
		boolean audienceUsed = false;
		if(lifeline>0) {
			if(lifelinechoice==1) {
				if(!fiftyfiftyUsed) {
					l.fiftyfifty("B],C]");
					fiftyfiftyUsed=true;
					lifeline--;
				}
				else {
					System.out.println("You have already used 50-50 lifeline. Please choose another option.");
					lifelinechoice = sc.nextInt();
				}
			}
			else if(lifelinechoice==2) {
				if(!audienceUsed) {
					l.audience("\n A]","has 85% choosen by audence");
					audienceUsed=true;
					lifeline--;
				}
				else {
					System.out.println("You have already used Audience lifeline. Please choose another option.");
					lifelinechoice = sc.nextInt();
				}
			}
		}
		System.out.println("Enter the correct Option(A,B,C,D)");
		char res =sc.next().charAt(0);
		try{
			if(res!=res1) {
				throw i1;
			}
			else {
				System.out.println("Correct answer");
				System.out.println("Karthik you have  reworded with RS.100000");
				System.out.println("This question is for "+p1.name);
				System.out.println("2. \r\n"
						+ "What is the largest lake in the world?");
				System.out.print("A]Baikal"+"                "+"B]Lake Superior");
				System.out.println();
				System.out.println("C]Caspian Sea"+"          "+"D]Ontario");
				char res2='A';
				System.out.println("Do you want  take lifeline");
				System.out.println("Press 1 for 50-50,Press 2 for Audionce,Press 3 Enter the Answer");
				Scanner sc1 =new Scanner(System.in);
				int lifelinechoice1=sc1.nextInt();
				if(lifeline>0) {
					if(lifelinechoice1==1) {
                        if(!fiftyfiftyUsed) {
                            l.fiftyfifty("B] ,C]");
                            fiftyfiftyUsed = true;
                            lifeline--;
                        } else {
                            System.out.println("You have already used 50-50 lifeline. Please choose another option.");
                            lifelinechoice1 = sc1.nextInt();
                        }
                    }
                    else if(lifelinechoice1==2) {
                        if(!audienceUsed) {
                            l.audience("A]"," has 80% chososen by auidence");
                            audienceUsed = true;
                            lifeline--;
                        } else {
                            System.out.println("You have already used Audience lifeline. Please choose another option.");
                            lifelinechoice1 = sc1.nextInt();
                        }
                    }
				}
			System.out.println("Enter the correct Option(A,B,C,D)");
			char res3 =sc1.next().charAt(0);
			if(res3!=res2) {
				throw i2;
			}
			else {
				System.out.println("Correct answer");
				System.out.println(" Karthik you have  reworded with RS.200000");
				System.out.println("This question is for "+p1.name);
				System.out.println("3. \r\n"
						+ " Which planet in the solar system is known as the “Red Planet”?");
				System.out.print("A]Venus "+"                "+"B]Earth");
				System.out.println();
				System.out.println("C]Mars"+"                "+"D]Jupiter");
				char res4='C';
				System.out.println("Do  you want life line");
				System.out.println("Press 1 for 50-50,Press 2 for Audionce,Press 3 To Enter The Answer");
				Scanner sc2 =new Scanner(System.in);
				int lifelinechoice2=sc2.nextInt();
				if(lifeline>0) {
                    if(lifelinechoice2==1) {
                        if(!fiftyfiftyUsed) {
                            l.fiftyfifty("A] ,D]");
                            fiftyfiftyUsed = true;
                            lifeline--;
                        } else {
                            System.out.println("You have already used 50-50 lifeline. Please choose another option.");
                            lifelinechoice2 = sc2.nextInt();
                        }
                    }
                    else if(lifelinechoice2==2) {
                        if(!audienceUsed) {
                            l.audience("C]","has 70% chososen by audience");
                            audienceUsed = true;
                            lifeline--;
                        } else {
                            System.out.println("You have already used Audience lifeline. Please choose another option.");
                            lifelinechoice2 = sc2.nextInt();
                        }
                    }
				}
				System.out.println("Enter the correct Option(A,B,C,D)");
				char res5 =sc2.next().charAt(0);
				if(res5!=res4) {
					throw i3;
				}
				else {
					System.out.println("Correct answer");
					System.out.println("Karthik you have  reworded with RS.300000");
					System.out.println("This question is for "+p1.name);
					System.out.println("4. \r\n"
							+ "Which Chalukyan ruler set up it capital at Vengi ?");
					System.out.print("A]Vishnuvardhan"+"                "+"B]Mahendravarman");
					System.out.println();
					System.out.println("C]Kakusthavarman"+"                "+"D]Pulakesin II");
					char res6='A';
					System.out.println("Do you want life line");
					System.out.println("Press 1 for 50-50,Press 2 for Audience,Press 3 to Enter the answer");
					Scanner sc3 =new Scanner(System.in);
					int lifelinechoice3=sc3.nextInt();
					if(lifeline>0) {
                        if(lifelinechoice3==1) {
                            if(!fiftyfiftyUsed) {
                                l.fiftyfifty("A] ,D]");
                                fiftyfiftyUsed = true;
                                lifeline--;
                            } else {
                                System.out.println("You have already used 50-50 lifeline. Please choose another option.");
                                lifelinechoice3 = sc3.nextInt();
                            }
                        }
                        else if(lifelinechoice3==2) {
                            if(!audienceUsed) {
                                l.audience("A]","has 80% chososen by auidence");
                                audienceUsed = true;
                                lifeline--;
                            } else {
                                System.out.println("You have already used Audience lifeline. Please choose another option.");
                                lifelinechoice3 = sc3.nextInt();
                            }
                        }
                    }
					System.out.println("Enter the correct Option(A,B,C,D)");
					char res7 =sc3.next().charAt(0);
					if(res7!=res6) {
						throw i4;
					}
					else {
						System.out.println("Correct answer");
						System.out.println("Karthik you have  reworded with RS.400000");
						System.out.println("This question is for "+p1.name);
						System.out.println("5. \r\n"
								+ "Which among the following was the royal emblem of Chera Kingdom?");
						System.out.print("A]Tiger "+"                "+"B]Bow");
						System.out.println();
						System.out.println("C]Fish"+"                "+"D]Carp");
						char res8='B';
						System.out.println("Do you want life line");
						System.out.println("Press 1 for 50-50,Press 2 for Audionce,Press 3 to Enter the answer");
						Scanner sc4 =new Scanner(System.in);
						int lifelinechoice4=sc4.nextInt();
						if(lifeline>0) {
                            if(lifelinechoice4==1) {
                                if(!fiftyfiftyUsed) {
                                    l.fiftyfifty("A] ,D]");
                                    fiftyfiftyUsed = true;
                                    lifeline--;
                                } else {
                                    System.out.println("You have already used 50-50 lifeline. Please choose another option.");
                                    lifelinechoice4 = sc4.nextInt();
                                }
                            }
                            else if(lifelinechoice4==2) {
                                if(!audienceUsed) {
                                    l.audience("B]","has 80% chososen by audence");
                                    audienceUsed = true;
                                    lifeline--;
                                } else {
                                    System.out.println("You have already used Audience lifeline. Please choose another option.");
                                    lifelinechoice4 = sc4.nextInt();
                                }
                            }
						}
						System.out.println("Enter the correct Option(A,B,C,D)");
						char res9 =sc4.next().charAt(0);
						if(res9!=res8) {
							throw i5;
						}
						else {
							System.out.println("Correct answer");
							System.out.println("Karthik you have  reworded with RS.500000");
							System.out.println("This question is for "+p1.name);
							System.out.println("6. \r\n"
									+ "Where was India’s first national Museum opened?");
							System.out.print("A]Delhi "+"                "+"B]Hyderabad");
							System.out.println();
							System.out.println("C]Rajasthan"+"                "+"D]Mumbai");
							char res10='D';
							System.out.println("Do you want life line");
							System.out.println("Press 1 for 50-50,Press 2 for Audionce,Press 3 to Enter the answer");
							Scanner sc5 =new Scanner(System.in);
							int lifelinechoice5=sc5.nextInt();
							if(lifeline>0) {
                                if(lifelinechoice5==1) {
                                    if(!fiftyfiftyUsed) {
                                        l.fiftyfifty("A] ,D]");
                                        fiftyfiftyUsed = true;
                                        lifeline--;
                                    } else {
                                        System.out.println("You have already used 50-50 lifeline. Please choose another option.");
                                        lifelinechoice5 = sc5.nextInt();
                                    }
                                }
                                else if(lifelinechoice5==2) {
                                    if(!audienceUsed) {
                                        l.audience("B]","has 80% chososen by audence");
                                        audienceUsed = true;
                                        lifeline--;
                                    } else {
                                        System.out.println("You have already used Audience lifeline. Please choose another option.");
                                        lifelinechoice5 = sc5.nextInt();
                                    }
                                }
							}
							System.out.println("Enter the correct Option(A,B,C,D)");
							char res11 =sc5.next().charAt(0);
							if(res11!=res10) {
								throw i6;
							}
							else {
								System.out.println("Correct answer");
								System.out.println("Karthik you have  reworded with RS.600000");
								System.out.println("This question is for "+p1.name);
								System.out.println("7. \r\n"
										+ "The world’s nation 5G mobile network was launched by which country?");
								System.out.print("A]Japan "+"                "+"B]Asia");
								System.out.println();
								System.out.println("C]Rajasthan"+"                "+"D]Malaysia");
								char res12='C';
								System.out.println("Do you want life line");
								System.out.println("Press 1 for 50-50,Press 2 for Audionce,Press 3 to Enter the answer");
								Scanner sc6 =new Scanner(System.in);
								int lifelinechoice6=sc6.nextInt();
								if(lifeline>0) {
	                                if(lifelinechoice6==1) {
	                                    if(!fiftyfiftyUsed) {
	                                        l.fiftyfifty("A] ,D]");
	                                        fiftyfiftyUsed = true;
	                                        lifeline--;
	                                    } else {
	                                        System.out.println("You have already used 50-50 lifeline. Please choose another option.");
	                                        lifelinechoice6 = sc6.nextInt();
	                                    }
	                                }
	                                else if(lifelinechoice4==2) {
	                                    if(!audienceUsed) {
	                                        l.audience("B]","has 80% chososen by audence");
	                                        audienceUsed = true;
	                                        lifeline--;
	                                    } else {
	                                        System.out.println("You have already used Audience lifeline. Please choose another option.");
	                                        lifelinechoice6 = sc6.nextInt();
	                                    }
	                                }
								}
								System.out.println("Enter the correct Option(A,B,C,D)");
								char res13 =sc6.next().charAt(0);
								if(res13!=res12) {
									throw i7;
								}
								else {
									System.out.println("Correct answer");
									System.out.println("Karthik you have  reworded with RS.600000");
									System.out.println("This question is for "+p1.name);
									System.out.println("8. \r\n"
											+ "The green planet in the solar system is?");
									System.out.print("A]Mars "+"                "+"B]Uranus");
									System.out.println();
									System.out.println("C]Venus"+"                "+"D]Earth");
									char res14='B';
									System.out.println("Do you want life line");
									System.out.println("Press 1 for 50-50,Press 2 for Audionce,Press 3 to Enter the answer");
									Scanner sc7 =new Scanner(System.in);
									int lifelinechoice7=sc7.nextInt();
									if(lifeline>0) {
		                                if(lifelinechoice7==1) {
		                                    if(!fiftyfiftyUsed) {
		                                        l.fiftyfifty("A] ,D]");
		                                        fiftyfiftyUsed = true;
		                                        lifeline--;
		                                    } else {
		                                        System.out.println("You have already used 50-50 lifeline. Please choose another option.");
		                                        lifelinechoice7 = sc7.nextInt();
		                                    }
		                                }
		                                else if(lifelinechoice7==2) {
		                                    if(!audienceUsed) {
		                                        l.audience("B]","has 80% chososen by audence");
		                                        audienceUsed = true;
		                                        lifeline--;
		                                    } else {
		                                        System.out.println("You have already used Audience lifeline. Please choose another option.");
		                                        lifelinechoice7 = sc7.nextInt();
		                                    }
		                                }
									}
									System.out.println("Enter the correct Option(A,B,C,D)");
									char res15 =sc7.next().charAt(0);
									if(res15!=res14) {
										throw i8;
									}
									else {
										System.out.println("Correct answer");
										System.out.println("Karthik you have  reworded with RS.600000");
										System.out.println("This question is for "+p1.name);
										System.out.println("9. \r\n"
												+ "The father of Indian missile technology is _________________?");
										System.out.print("A]Dr Homi Bhabha"+"                "+"B]Dr Chidambaram");
										System.out.println();
										System.out.println("C]Dr U.R. Rao"+"                "+"D]Dr A.P.J. Abdul Kalam ");
										char res16='D';
										System.out.println("Do you want life line");
										System.out.println("Press 1 for 50-50,Press 2 for Audionce,Press 3 to Enter the answer");
										Scanner sc8 =new Scanner(System.in);
										int lifelinechoice8=sc8.nextInt();
										if(lifeline>0) {
			                                if(lifelinechoice8==1) {
			                                    if(!fiftyfiftyUsed) {
			                                        l.fiftyfifty("A] ,D]");
			                                        fiftyfiftyUsed = true;
			                                        lifeline--;
			                                    } else {
			                                        System.out.println("You have already used 50-50 lifeline. Please choose another option.");
			                                        lifelinechoice8 = sc8.nextInt();
			                                    }
			                                }
			                                else if(lifelinechoice8==2) {
			                                    if(!audienceUsed) {
			                                        l.audience("B]","has 80% chososen by audence");
			                                        audienceUsed = true;
			                                        lifeline--;
			                                    } else {
			                                        System.out.println("You have already used Audience lifeline. Please choose another option.");
			                                        lifelinechoice8 = sc8.nextInt();
			                                    }
			                                }
										}
										System.out.println("Enter the correct Option(A,B,C,D)");
										char res17 =sc8.next().charAt(0);
										if(res17!=res16) {
											throw i9;
										}
										else {
											System.out.println("Correct answer");
											System.out.println("Karthik you have  reworded with RS.600000");
											System.out.println("This question is for "+p1.name);
											System.out.println("10. \r\n"
													+ "hich of these is the small-scale industry in India?");
											System.out.print("A]Jute industry "+"                "+"B]Paper Industry");
											System.out.println();
											System.out.println("C]Textile Industry"+"                "+"D]Handloom Industry ");
											char res18='D';
											System.out.println("Do you want life line");
											System.out.println("Press 1 for 50-50,Press 2 for Audionce,Press 3 to Enter the answer");
											Scanner sc9 =new Scanner(System.in);
											int lifelinechoice9=sc9.nextInt();
											if(lifeline>0) {
				                                if(lifelinechoice9==1) {
				                                    if(!fiftyfiftyUsed) {
				                                        l.fiftyfifty("A] ,D]");
				                                        fiftyfiftyUsed = true;
				                                        lifeline--;
				                                    } else {
				                                        System.out.println("You have already used 50-50 lifeline. Please choose another option.");
				                                        lifelinechoice9 = sc9.nextInt();
				                                    }
				                                }
				                                else if(lifelinechoice9==2) {
				                                    if(!audienceUsed) {
				                                        l.audience("B]","has 80% chososen by audence");
				                                        audienceUsed = true;
				                                        lifeline--;
				                                    } else {
				                                        System.out.println("You have already used Audience lifeline. Please choose another option.");
				                                        lifelinechoice9 = sc9.nextInt();
				                                    }
				                                }
											}
											System.out.println("Enter the correct Option(A,B,C,D)");
											char res19 =sc9.next().charAt(0);
											if(res19!=res18) {
												throw i10;
											}
											System.out.println("Correct answer");
											System.out.println("Karthik you have  reworded with RS.1000000 And you have won the QUIZ");
										}

									}

								}

							}

						}
					}
				}
			}
		}
	}
	catch(oneQuestionException e) {
		System.out.println(i1.getMessage());
		System.exit(0);
	}
	catch(twoQuestionException e) {
		System.out.println(i2.getMessage());
		System.exit(0);
	}
	catch(threeQuestionException e) {
		System.out.println(i3.getMessage());
		System.exit(0);
	}
	catch(fourQuestionException e) {
		System.out.println(i4.getMessage());
		System.exit(0);
	}
	catch(fiveQuestionException e) {
		System.out.println(i5.getMessage());
		System.exit(0);
	}
	catch(sixQuestionException e) {
		System.out.println(i6.getMessage());
		System.exit(0);
	}
	catch(sevenQuestionException e) {
		System.out.println(i7.getMessage());
		System.exit(0);
	}
	catch(eightQuestionException e) {
		System.out.println(i8.getMessage());
		System.exit(0);
	}
	catch(nineQuestionException e) {
		System.out.println(i9.getMessage());
		System.exit(0);
	}
	catch(tenQuestionException e) {
		System.out.println(i10.getMessage());
		System.exit(0);
	}
}
}
