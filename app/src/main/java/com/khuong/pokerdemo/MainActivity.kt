package com.khuong.pokerdemo
 //demo pull
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.AsyncTask
import android.os.Bundle
import android.os.SystemClock
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.khuong.pokerdemo.databinding.ActivityMainBinding
import java.util.concurrent.Executors

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val asy = MyAsynctask()
        asy.executeOnExecutor(Executors.newFixedThreadPool(1), 12, 0)
        binding.btnGiai.setOnClickListener {
            action7()
        }
    }

    private fun action7(){
        val ani = ObjectAnimator.ofFloat(binding.ivPoker2, "alpha", 0f, 0f, 0f, 0f)
        val ani1 = ObjectAnimator.ofFloat(binding.ivPoker1, "alpha", 0f, 0f, 0f, 0f)
        val ani2 = ObjectAnimator.ofFloat(binding.tvNumber, "alpha", 0f, 0f, 0f, 0f)
        val ani3 = ObjectAnimator.ofFloat(binding.btnGiai, "alpha", 0f, 0f, 0f, 0f)
        val ani4 = ObjectAnimator.ofFloat(binding.tvRun, "alpha", 0f, 0f, 0f, 0f)
        val ani5 = ObjectAnimator.ofFloat(binding.tvRedy, "alpha", 0f, 0f, 0f, 0f)
        val ani6 = ObjectAnimator.ofFloat(binding.ivPoker4, "alpha", 0f, 0f, 0f, 0f)
        val ani7 = ObjectAnimator.ofFloat(binding.tvSeen, "alpha", 0.1f, 0.4f, 0.7f, 1.0f)
        val ani8 = ObjectAnimator.ofFloat(binding.tvSeen, "y", 600f, 400f, 200f, 0f)
        ani8.setDuration(2000)
        val aniSet = AnimatorSet()
        aniSet.playTogether(
            ani6,
            ani1,
            ani,
            ani5,
            ani4,
            ani3,
            ani7,
            ani8,
            ani2
        )
        aniSet.start()
        binding.tvSeen.setText(
            "Phân tích hình tượng\n" +
                    "\n" +
                    "Bạn sẽ không khó khăn để nhận ra Bảo Bình giữa đám đông, họ thường có mái tóc " +
                    "màu, vẻ bề ngoài cao ráo, ưa nhìn. Là một trong những chòm sao thuộc nhóm " +
                    "Không Khí, Bảo Bình đam mê những hoạt động về trí tuệ, nghiên cứu khoa học, " +
                    "công nghệ.\n" +
                    "\n" +
                    "Giữa đám đông Bảo Bình luôn là người mang nước đến cho mọi người, họ cảm thấy " +
                    "nước là điều cần thiết cho cuộc bàn luận. Bạn đừng quá ngạc nhiên bởi Bảo Bình " +
                    "được mệnh danh là “người mang nước” đến cho loài người.\n" +
                    "\n" +
                    "Cũng có khi bạn gặp Bảo Bình trong vai trò của một người bán nước trên phố. Họ " +
                    "vác những bình nước trên đôi vai của mình mà không hề mệt mỏi ngược lại công " +
                    "việc ấy đem lại cho Bảo Bình những niềm vui, niềm hạnh phúc riêng.\n" +
                    "\n" +
                    "Trong thần thoại Hy Lạp có một lần thần Zeus xuống thăm trái đất và vô cùng " +
                    "kinh ngạc trước vẻ đẹp khôi ngô tuấn tú của chàng thanh niên bán nước. Vì Zeus " +
                    "có sở thích ngụy trang thành những người đẹp đẽ nên thần đã đưa chàng trai ấy " +
                    "lên thiên đàng, khiến cho vẻ đẹp của anh ta không bao giờ phai tàn để thỏa mãn " +
                    "sở thích của mình. Chàng thanh niên xuất thân từ một con người bình thường nhưng " +
                    "đã may mắn được chọn làm người đại diện cho vẻ đẹp tươi trẻ, không bao giờ già."
        )
    }

    inner class MyAsynctask : AsyncTask<Int, String, Void>() {
        //Asynctask<execute,onProress>
        override fun onPreExecute() {
            super.onPreExecute()
        }

        override fun onProgressUpdate(vararg a: String?) {
            binding.tvNumber.setText(a[0])
            if (a[0]!!.toInt() == 12) {
                action1()
            }
            if (a[0]!!.toInt() == 9) {
                action2()
            }
            if (a[0]!!.toInt() == 7) {
                action3()
            }
            if (a[0]!!.toInt() == 5) {
                action4()

            }
            if (a[0]!!.toInt() == 4) {
                action5()
            }
            if (a[0]!!.toInt() == 0) {
                val list = mutableSetOf<Int>(
                    R.drawable.tep9,
                    R.drawable.tep8,
                    R.drawable.tep7,
                    R.drawable.tep6,
                    R.drawable.tep5,
                    R.drawable.tep4,
                    R.drawable.tep3,
                    R.drawable.tep2,
                    R.drawable.tepa,
                    R.drawable.tep10,
                    R.drawable.tepj,
                    R.drawable.tepq,
                    R.drawable.tepk,
                    R.drawable.co9,
                    R.drawable.co8,
                    R.drawable.co7,
                    R.drawable.co6,
                    R.drawable.co5,
                    R.drawable.co4,
                    R.drawable.co3,
                    R.drawable.co2,
                    R.drawable.coa,
                    R.drawable.co10,
                    R.drawable.coj,
                    R.drawable.coq,
                    R.drawable.cok,
                    R.drawable.bich9,
                    R.drawable.bich8,
                    R.drawable.bich7,
                    R.drawable.bich6,
                    R.drawable.bich5,
                    R.drawable.bich4,
                    R.drawable.bich3,
                    R.drawable.bich2,
                    R.drawable.bicha,
                    R.drawable.bich10,
                    R.drawable.bichj,
                    R.drawable.bichq,
                    R.drawable.bichk,
                    R.drawable.ro9,
                    R.drawable.ro8,
                    R.drawable.ro7,
                    R.drawable.ro6,
                    R.drawable.ro5,
                    R.drawable.ro4,
                    R.drawable.ro3,
                    R.drawable.ro2,
                    R.drawable.roa,
                    R.drawable.ro10,
                    R.drawable.roj,
                    R.drawable.roq,
                    R.drawable.rok
                )
                val k = list.random()
                val q = list.random()
                val j = list.random()
                binding.ivPoker1.setImageResource(j)
                binding.ivPoker2.setImageResource(q)
                binding.ivPoker4.setImageResource(k)
                action6()
            }
        }

        override fun onPostExecute(result: Void?) {
            super.onPostExecute(result)
        }

        override fun doInBackground(vararg values: Int?): Void? {
            for (i in values[0]!! downTo values[1]!!) {
                publishProgress(i.toString(), (i + 1).toString())
                SystemClock.sleep(1000)
            }
            return null
        }

        private fun action1() {
            val aniHi = ObjectAnimator.ofFloat(
                binding.tvHi,
                "alpha",
                0.2f,
                0.4f,
                0.6f,
                0.8f,
                1.0f,
                0f,
                0f,
                0f,
                0f
            )
            aniHi.setDuration(5000)
            val ani12345 = ObjectAnimator.ofFloat(binding.tvRedy, "alpha", 0f, 0f, 0f, 0f)
            val ani123456 = ObjectAnimator.ofFloat(binding.tvRun, "alpha", 0f, 0f, 0f, 0f)
            val ani1234567 = ObjectAnimator.ofFloat(binding.tvNumber, "alpha", 0f, 0f, 0f, 0f)
            val ani12345678 = ObjectAnimator.ofFloat(binding.btnGiai, "alpha", 0f, 0f, 0f, 0f)
            val anibtn = ObjectAnimator.ofFloat(binding.btnGiai, "y", -500f, -500f)
            ani12345.setDuration(5000)
            ani123456.setDuration(5000)
            ani1234567.setDuration(5000)
            ani12345678.setDuration(5000)
            aniHi.setDuration(5000)
            val ani1 = ObjectAnimator.ofFloat(binding.ivPoker1, "alpha", 1.0f, 1.0f, 0f, 0f)
            ani1.setDuration(5000)
            val ani1a = ObjectAnimator.ofFloat(binding.ivPoker1, "rotation", 135f)
            val ani1b = ObjectAnimator.ofFloat(binding.ivPoker2, "rotation", 45f)
            val ani1c = ObjectAnimator.ofFloat(binding.ivPoker4, "rotation", 90f)
            val ani2 = ObjectAnimator.ofFloat(binding.ivPoker2, "alpha", 1.0f, 1.0f, 0f, 0f)
            ani2.setDuration(5000)
            val ani3 = ObjectAnimator.ofFloat(binding.ivPoker4, "alpha", 1.0f, 1.0f, 0f, 0f)
            ani3.setDuration(5000)
            val aniY1 = ObjectAnimator.ofFloat(binding.ivPoker1, "y", 600f, 600f)
            aniY1.setDuration(2000)
            val aniX1 = ObjectAnimator.ofFloat(binding.ivPoker1, "x", 1100f, 700f)
            aniX1.setDuration(2000)
            val aniX2 = ObjectAnimator.ofFloat(binding.ivPoker2, "x", -250f, 80f)
            aniX2.setDuration(2000)
            val aniY2 = ObjectAnimator.ofFloat(binding.ivPoker2, "y", 600f, 600f)
            aniY2.setDuration(2000)
            val aniX3 = ObjectAnimator.ofFloat(binding.ivPoker4, "x", 400f, 400f)
            aniX3.setDuration(2000)
            val aniY3 = ObjectAnimator.ofFloat(binding.ivPoker4, "y", 2000f, 1200f)
            aniY3.setDuration(2000)
            val aniSet = AnimatorSet()
            aniSet.playTogether(
                aniX1,
                aniY1,
                aniX2,
                aniY2,
                aniX3,
                aniY3,
                aniHi,
                ani1b,
                ani1a,
                ani1c,
                ani3,
                ani2,
                anibtn,
                ani1,
                ani12345,
                ani123456,
                ani1234567,
                ani12345678
            )
            aniSet.start()
        }

        private fun action2() {
            val ani1a = ObjectAnimator.ofFloat(binding.ivPoker1, "rotation", 0f)
            val ani1b = ObjectAnimator.ofFloat(binding.ivPoker2, "rotation", 0f)
            val ani1c = ObjectAnimator.ofFloat(binding.ivPoker4, "rotation", 0f)
            val aniPoker5 = ObjectAnimator.ofFloat(binding.ivPoker4, "alpha", 0.2f, 0.6f, 1.0f)
            aniPoker5.setDuration(2000)
            val aniPoker4 = ObjectAnimator.ofFloat(binding.ivPoker1, "alpha", 1.0f, 1.0f)
            aniPoker4.setDuration(2000)
            val aniPoker6 = ObjectAnimator.ofFloat(binding.ivPoker2, "alpha", 1.0f, 1.0f)
            aniPoker6.setDuration(2000)
            val aniText = ObjectAnimator.ofFloat(binding.tvRedy, "alpha", 0.2f, 0.6f, 1.0f)
            aniText.setDuration(2000)
            val aniX4 = ObjectAnimator.ofFloat(binding.ivPoker1, "x", 50f, 50f)
            aniX4.setDuration(2000)
            val aniY4 = ObjectAnimator.ofFloat(binding.ivPoker1, "y", 500f, 854f)
            val aniY = ObjectAnimator.ofFloat(binding.ivPoker4, "y", 854f, 854f)
            aniY4.setDuration(2000)
            val aniX6 = ObjectAnimator.ofFloat(binding.ivPoker2, "x", 730f, 730f)
            aniX6.setDuration(2000)
            val aniY6 = ObjectAnimator.ofFloat(binding.ivPoker2, "y", 1300f, 854f)
            aniY6.setDuration(2000)
            val aniSet = AnimatorSet()
            aniSet.playTogether(
                aniPoker5,
                aniText,
                aniX4,
                ani1a,
                ani1b,
                ani1c,
                aniY4,
                aniY,
                aniX6,
                aniY6,
                aniPoker4,
                aniPoker6
            )
            aniSet.start()
        }

        private fun action3() {
            val aniPoker5 = ObjectAnimator.ofFloat(binding.ivPoker4, "alpha", 1.0f, 0f)
            aniPoker5.setDuration(2000)
            val aniPoker4 = ObjectAnimator.ofFloat(binding.ivPoker1, "alpha", 1.0f, 0f)
            aniPoker4.setDuration(2000)
            val aniPoker6 = ObjectAnimator.ofFloat(binding.ivPoker2, "alpha", 1.0f, 0f)
            aniPoker6.setDuration(2000)
            val aniText = ObjectAnimator.ofFloat(binding.tvRedy, "alpha", 1.0f, 0f)
            aniText.setDuration(2000)
            val aniSet = AnimatorSet()
            aniSet.playTogether(aniPoker5, aniPoker4, aniPoker6, aniText)
            aniSet.start()
        }

        private fun action4() {
            val aniText = ObjectAnimator.ofFloat(binding.tvRun, "alpha", 1.0f, 1.0f)
            aniText.setDuration(2000)
            val aniNumber = ObjectAnimator.ofFloat(binding.tvNumber, "alpha", 1.0f, 1.0f)
            aniNumber.setDuration(2000)
            val aniSet = AnimatorSet()
            aniSet.playTogether(
                aniText,
                aniNumber
            )
            aniSet.start()

        }

        private fun action5() {
            val aniPoker5 = ObjectAnimator.ofFloat(
                binding.ivPoker4,
                "alpha",
                0.2f,
                0.6f,
                1.0f,
                0.5f,
                1.0f,
                0.5f,
                1.0f
            )
            aniPoker5.setDuration(4000)
            val aniPoker4 = ObjectAnimator.ofFloat(
                binding.ivPoker1,
                "alpha",
                0.2f,
                0.6f,
                1.0f,
                0.5f,
                1.0f,
                0.5f,
                1.0f
            )
            aniPoker4.setDuration(4000)
            val aniPoker6 = ObjectAnimator.ofFloat(
                binding.ivPoker2,
                "alpha",
                0.2f,
                0.6f,
                1.0f,
                0.5f,
                1.0f,
                0.5f,
                1.0f
            )
            aniPoker6.setDuration(4000)
            val aniX4 = ObjectAnimator.ofFloat(binding.ivPoker1, "x", 50f, 50f)
            aniX4.setDuration(2000)
            val aniY4 = ObjectAnimator.ofFloat(binding.ivPoker1, "y", 300f, 600f)
            aniY4.setDuration(2000)
            val aniX6 = ObjectAnimator.ofFloat(binding.ivPoker2, "x", 730f, 730f)
            aniX6.setDuration(2000)
            val aniY6 = ObjectAnimator.ofFloat(binding.ivPoker2, "y", 1300f, 1050f)
            aniY6.setDuration(2000)
            val aniSet = AnimatorSet()
            aniSet.playTogether(
                aniPoker5,
                aniX4,
                aniY4,
                aniX6,
                aniY6,
                aniPoker4,
                aniPoker6
            )
            aniSet.start()
        }

        private fun action6() {
            val aniPoker5 =
                ObjectAnimator.ofFloat(
                    binding.ivPoker4,
                    "alpha",
                    0.1f,
                    0.5f,
                    1.0f,
                    0.5f,
                    1.0f
                )
            val aniBtn =
                ObjectAnimator.ofFloat(
                    binding.btnGiai,
                    "alpha",
                    0.1f,
                    1.0f,
                    0.5f,
                    1.0f,
                    0.5f,
                    1.0f
                )
            aniPoker5.setDuration(2000)
            aniBtn.setDuration(2000)
            val aniPoker4 = ObjectAnimator.ofFloat(
                binding.ivPoker1,
                "alpha",
                0.1f,
                0.5f,
                1.0f,
                0.5f,
                1.0f,
                0.5f,
                1.0f
            )
            aniPoker4.setDuration(2000)
            val aniPoker6 =
                ObjectAnimator.ofFloat(
                    binding.ivPoker2,
                    "alpha",
                    0.1f,
                    1.0f,
                    0.5f,
                    1.0f,
                    0.5f,
                    1.0f
                )
            aniPoker6.setDuration(2000)
            val aniX4 = ObjectAnimator.ofFloat(binding.ivPoker1, "x", 50f, 50f)
            aniX4.setDuration(2000)
            val aniY4 = ObjectAnimator.ofFloat(binding.ivPoker1, "y", 500f, 850f)
            val aniYbtn = ObjectAnimator.ofFloat(binding.btnGiai, "y", 500f, 1550f)
            aniYbtn.setDuration(2000)
            aniY4.setDuration(2000)
            val aniX6 = ObjectAnimator.ofFloat(binding.ivPoker2, "x", 730f, 730f)
            aniX6.setDuration(2000)
            val aniY6 = ObjectAnimator.ofFloat(binding.ivPoker2, "y", 1300f, 850f)
            aniY6.setDuration(2000)
            val aniSet = AnimatorSet()
            aniSet.playTogether(
                aniPoker5,
                aniX4,
                aniY4,
                aniYbtn,
                aniX6,
                aniY6,
                aniPoker4,
                aniPoker6,
                aniBtn
            )
            aniSet.start()
        }
    }
}
