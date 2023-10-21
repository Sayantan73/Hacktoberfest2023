from turtle import Turtle
import os
import sys

ALIGNMENT= "center"
FONT = ("Courier", 15, "normal")

class Scoreboard(Turtle):
    def __init__(self):
        self.score = 0
        self.high_score = 0
        self.read_high_score()
        super().__init__()
        self.color("white")
        self.hideturtle()
        self.penup()
        self.goto(0, 270)
        self.update_scoreboard()

    def read_high_score(self):
        with open(os.path.join(sys.path[0],"data.txt"), "r") as f:
            self.high_score = int(f.read())

    def write_high_score(self):
        with open(os.path.join(sys.path[0],"data.txt"), "w") as f:
            f.write(str(self.high_score))

    def update_scoreboard(self):
        self.clear()
        self.write(f"score: {self.score} High Score: {self.high_score}",align=ALIGNMENT, font=FONT)

    def reset(self):
        if self.score > self.high_score:
            self.high_score = self.score
            self.write_high_score()
        self.score = 0
        self.update_scoreboard()

    def increase_score(self):
        self.score += 1
        self.update_scoreboard()

