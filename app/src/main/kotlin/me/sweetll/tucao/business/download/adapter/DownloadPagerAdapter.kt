package me.sweetll.tucao.business.download.adapter

import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import me.sweetll.tucao.business.download.fragment.DownloadedFragment
import me.sweetll.tucao.business.download.fragment.DownloadingFragment

class DownloadPagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm) {
    val tabTitles = listOf("已缓存", "缓存中")

    override fun getCount(): Int = tabTitles.size

    override fun getItem(position: Int) =
        when (position) {
            0 -> DownloadedFragment()
            else -> DownloadingFragment()
        }

    override fun getPageTitle(position: Int) = tabTitles[position]
}
