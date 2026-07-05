from datetime import datetime
import time
import os

def set_alarm(alarm_time):
    print(f"Alarm set for {alarm_time}")

    while True:
        current_time = datetime.now().strftime("%H:%M:%S")
        print(f"Current Time: {current_time}", end="\r")

        if current_time == alarm_time:
            print("\n⏰ Alarm! Wake up!")

            # Windows
            try:
                import winsound
                winsound.Beep(1000, 1000)
            except ImportError:
                # Linux/macOS fallback
                os.system("printf '\a'")

            break

        time.sleep(1)

# Example
alarm = input("Enter alarm time (HH:MM:SS): ")
set_alarm(alarm)
